package homework6;

public interface ListInterface<T> {
    void add(T t);
    void remove(int indes);
    void clear();
    T get(int index);
    int size();
}
