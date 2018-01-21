package homework6;

public class Stack<T>  extends MyLinkedList<T> implements LIFO<T> {

    @Override
    public T pop() {
        if (size > 0) {
            T tt = currentEssence.essence;
            currentEssence = currentEssence.prevEssence;
            size--;
            return tt;
        }
        else return null;
    }

    @Override
    public T peek() {
        if (size > 0){
            return currentEssence.essence;
        }
        else return null;
    }
}
