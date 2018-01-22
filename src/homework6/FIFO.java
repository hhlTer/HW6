package homework6;

public interface FIFO<T> extends ListInterface<T>{
    T poll();
    T peek();
}
