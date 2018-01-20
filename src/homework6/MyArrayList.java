package homework6;

public class MyArrayList<T> extends MyList<T> {
    private final static int BASE_SIZE_ARRAY = 10;
    private T[] mainArray;
    private int arraySize = BASE_SIZE_ARRAY;

    public MyArrayList(){
        mainArray = (T[])new Object[arraySize];
    }

    @SafeVarargs
    public MyArrayList(T...t){
        int l = t.length >= BASE_SIZE_ARRAY ? (int)(t.length*1.5) : BASE_SIZE_ARRAY;
        this.arraySize = l;
        mainArray = (T[])new Object[arraySize];

        int count = 0;
        for (T temp:
                t) {
            mainArray[count++] = temp;
        }
    }
    @Override
    public void add(T t) {
        mainArray[size++] = t;
        if (size == arraySize) expanseMainArray();
    }
    @Override
    public void remove(int index){
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (i == index) continue;
            mainArray[count++] = mainArray[i];
        }
        size--;
    }
    @Override
    public void clear() {
        mainArray = (T[])new Object[BASE_SIZE_ARRAY];
        arraySize = BASE_SIZE_ARRAY;
        size = 0;
    }
    @Override
    public T get(int index){
        return mainArray[index];
    }

    private void expanseMainArray(){
        arraySize = size < BASE_SIZE_ARRAY ? BASE_SIZE_ARRAY : (int)(size*1.5);
        Object[] temp = new Object[arraySize];
        System.arraycopy(mainArray, 0, temp, 0, size);
        mainArray = (T[]) new Object[arraySize];
        System.arraycopy(temp, 0, mainArray, 0, size);
    }

}
