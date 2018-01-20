package homework6;

public class Queue<T> extends MyLinkedList<T> implements Staak<T>, FIFO<T> {
    @Override
    public T poll() {
        if (size > 0) {
            T tt = firstEssence.essence;
            firstEssence = firstEssence.nextEssence;
            size--;
            return tt;
        }
        else return null;
    }

    @Override
    public T peek() {
        if (size > 0){
            return firstEssence.essence;
        }
        else return null;
    }
}
