package homework6;

public class MyLinkedList<T> extends MyList<T> implements ListInterface<T> {

//    private int size = 0;
    Essence<T> currentEssence;
    Essence<T> firstEssence;


    public MyLinkedList(){
    }

    @Override
    public void add(T t) {
        if (size == 0) {
            firstEssence = new Essence<>(t);
            currentEssence = firstEssence;
        }
        else
        currentEssence = new Essence<>(t, currentEssence);
        size++;
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= size) throw new ArrayIndexOutOfBoundsException();
        if (index == 0) {
            firstEssence.nextEssence.prevEssence = null;
            firstEssence = firstEssence.nextEssence;
            size--;
            return;
        }
        if (index == size-1){
            currentEssence.prevEssence.nextEssence = null;
            currentEssence = currentEssence.prevEssence;
            size--;
            return;
        }

        Essence<T> tempEssence = getCorrectEssence(index);
        tempEssence.prevEssence.nextEssence = tempEssence.nextEssence;
        tempEssence.nextEssence.prevEssence = tempEssence.prevEssence;
        size--;
    }

    private Essence<T> getCorrectEssence(int index){
        boolean firstHalf = index < (size >> 1);
        Xcrement change = firstHalf ? (x -> x + 1) : (x -> x - 1);
        Essence<T> e = firstHalf ? firstEssence : currentEssence;
        int count = firstHalf ? 0 : size-1;

        while (count != index ){
            e = firstHalf ? e.nextEssence
                    : e.prevEssence;
            count = change.crt(count);
        }
        return e;
    }

    @Override
    public void clear() {
        if (size == 0) return;
        while (size >= 1){
            Essence e = currentEssence.prevEssence;
            currentEssence = null;
            currentEssence = e;
            size--;
        }
        firstEssence = null;
    }

    @Override
    public T get(int index) throws ArrayIndexOutOfBoundsException{
        if (index < 0 || index >= size) throw new ArrayIndexOutOfBoundsException();
        return index == size-1 ? currentEssence.essence : getCorrectEssence(index).essence;
    }

//    @Override
//    public int size() {
//        return size;
//    }

    class Essence<T>{
        T essence;
        Essence<T> prevEssence;
        Essence<T> nextEssence;

        Essence(T t){
            essence = t;
            prevEssence = null;
            nextEssence = null;
        }
        Essence(T t, Essence<T> currentEssence){
            prevEssence = currentEssence;
            essence = t;
            nextEssence = null;
            prevEssence.nextEssence = this;
        }

        Essence<T> getEntyty(){
            return this;
        }
    }
}
