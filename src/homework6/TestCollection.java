package homework6;

import java.util.Iterator;

public class TestCollection {
    public static void main(String[] args) {

//        MyLinkedList<String> arrayList = new MyLinkedList<>();


        //HashMap
        HashMap<Integer, String> map = new HashMap<Integer, String>(10, "First element, key 10");
        map.put(10, "Changed element, key 10");
        map.put(20, "second element");
        System.out.println(map.has(10));
        System.out.println(map.has(20));
        System.out.println(map.has(0));
        System.out.println(map.has(2));
        System.out.println(map.get(10));
        System.out.println(map.get(20));
        map.put(30, "30 element");
        map.put(20, "Changed element, key 20");
        System.out.println(map.get(20));
        map.remove(20);
        System.out.println(map.get(10));
        System.out.println(map.get(30));

//        System.out.println(arrayList.get(0));
//            System.out.println(arrayList.get(1));
//            System.out.println(arrayList.get(2));
//            System.out.println(arrayList.get(3));
//            System.out.println(arrayList.get(4));
//            System.out.println(arrayList.get(5));
//            System.out.println(arrayList.get(6));
//            System.out.println(arrayList.get(7));
//            System.out.println(arrayList.get(8));
//            System.out.println(arrayList.get(9));
//            System.out.println(arrayList.get(10));

//            arrayList.clear();



        //        MyArrayList<String> arrayList = new MyArrayList<>();
//        arrayList.put("first element");
//        arrayList.put("second element");
//        arrayList.put("third element");
//        arrayList.put("4 element");
//        arrayList.put("5 element");
//        arrayList.put("6 element");
//        arrayList.put("7 element");
//        arrayList.put("8 element");
//        arrayList.put("9 element");
//        arrayList.put("10 element");
//        arrayList.put("11 element");
//        arrayList.remove(0);
//        arrayList.remove(2);
//        arrayList.remove(3);
//        for (int i = 0; i < arrayList.size; i++) {
//            System.out.println(arrayList.get(i));
//        }

    }
    void testStack(){
        Stack<String> arrayList = new Stack<>();
        arrayList.add("first element");
        arrayList.add("second element");
        arrayList.add("third element");
        arrayList.add("4 element");
        arrayList.add("5 element");
        arrayList.add("6 element");
        arrayList.add("7 element");
        arrayList.add("8 element");
        arrayList.add("9 element");
        arrayList.add("10 element");
        arrayList.add("11 element");
        System.out.println(arrayList.size());
//        arrayList.remove(10);
        arrayList.remove(4);
//        arrayList.remove(8);
        arrayList.add("12 element");

        System.out.println(arrayList.size());
//        arrayList.put("10 element");

        System.out.println(arrayList.pop());
        System.out.println(arrayList.pop());
        System.out.println("===============================");

        arrayList.add("sas");
        System.out.println(arrayList.pop());
        System.out.println(arrayList.peek());
        System.out.println(arrayList.peek());
        System.out.println(arrayList.peek());

    }
}
