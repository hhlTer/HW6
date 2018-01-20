package homework6;

public class MyArrayList<T> extends MyList<T> {

//    @Override
//    public void remove(int index){
//        if (index < 0) throw new ArrayIndexOutOfBoundsException();
//
//        Object[] part2 = new Object[size-index-1];
//        if (index == 0) System.arraycopy(mainArray, 1, mainArray, 0, size--);
//        else
//            if (index == size) mainArray[size--] = null;
//        else //if (index > 0 & index < size)
//         {
//            System.arraycopy(mainArray, index + 1 , part2, 0, size-index-1);
//            System.arraycopy(part2, 0, mainArray, index, --size-index);
//        }
//
//        if (arraySize > 10 & size < (int)(arraySize*0.74)) expanseMainArray();
//    }
//
//

//    private void dexpanseMainArray(){
//        arraySize = (int)(size*1.5);
//        Object[] temp = new Object[arraySize];
//        System.arraycopy(mainArray, 0, temp, 0, size);
//        mainArray = new Object[arraySize];
//        System.arraycopy(temp, 0, mainArray, 0, size);
//    }
}
