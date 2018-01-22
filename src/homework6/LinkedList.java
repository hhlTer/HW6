package homework6;

public class LinkedList<T> implements ListInterface<T> {

    int size = 0;
    Essence currentEssence;
    Essence firstEssence;


    public LinkedList(){
    }

    @Override
    public void add(T t) {
        if (size == 0) {
            firstEssence = new Essence(t);
            currentEssence = firstEssence;
        }
        else
        currentEssence = new Essence(t, currentEssence);
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

        Essence tempEssence = getCorrectEssence(index);
        tempEssence.prevEssence.nextEssence = tempEssence.nextEssence;
        tempEssence.nextEssence.prevEssence = tempEssence.prevEssence;
        size--;
    }

    private Essence getCorrectEssence(int index){
        boolean firstHalf = index < (size >> 1);
        Xcrement change = firstHalf ? (x -> x + 1) : (x -> x - 1);
        Essence e = firstHalf ? firstEssence : currentEssence;
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
        firstEssence.essence = null;
        firstEssence.nextEssence = null;
        firstEssence.prevEssence = null;
        currentEssence.essence = null;
        currentEssence.nextEssence = null;
        currentEssence.prevEssence = null;
        size = 0;
    }

    @Override
    public T get(int index) throws ArrayIndexOutOfBoundsException{
        if (index < 0 || index >= size) throw new ArrayIndexOutOfBoundsException();
        return index == size-1 ? currentEssence.essence : getCorrectEssence(index).essence;
    }

    @Override
    public int size() {
        return size;
    }

//    @Override
//    public int size() {
//        return size;
//    }

    class Essence{
        T essence;
        Essence prevEssence;
        Essence nextEssence;

        Essence(T t){
            essence = t;
            prevEssence = null;
            nextEssence = null;
        }
        Essence(T t, Essence currentEssence){
            prevEssence = currentEssence;
            essence = t;
            nextEssence = null;
            prevEssence.nextEssence = this;
        }

    }
}
