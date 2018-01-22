package homework6;

public class TestCollection {
    public static void main(String[] args) {

        //HashMap
        HashMap<Integer, String> map = new HashMap<>(10, "First element, key 10");
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

        testLinkedList();
        testQueue();
        testStack();
    }
    private static void testStack(){
        System.out.println("creating and adding 11 elements (first - \"first element\", last - \"11 element\"");
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
        System.out.println("size = " + arrayList.size());
//        arrayList.remove(10);
        System.out.println("remove 4 element");
        arrayList.remove(4);

        System.out.println("remove 0 element");
        arrayList.remove(0);
        System.out.println("remove last element");
        arrayList.remove(arrayList.size() - 1);
//        arrayList.remove(8);
        System.out.println("add 12 element");
        arrayList.add("12 element");

        System.out.println("size - " + arrayList.size());
//        arrayList.put("10 element");

        System.out.println("pop1 - " + arrayList.pop());
        System.out.println("pop2 - " + arrayList.pop());
        System.out.println("===============================");

        System.out.println("add 13 element");
        arrayList.add("13 element");
        System.out.println("pop" + arrayList.pop());
        System.out.println("size - " + arrayList.size());
        System.out.println("peek1" + arrayList.peek());
        System.out.println("peek2" + arrayList.peek());
        System.out.println("peek3" + arrayList.peek());
        System.out.println("size - " + arrayList.size());

    }

    /**
     *
     */
    private static void testQueue() {
        System.out.println("creating and adding 11 elements (first - \"first element\", last - \"11 element\"");
        Queue<String> arrayList = new Queue<>();
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
        System.out.println("size = " + arrayList.size());
//        arrayList.remove(10);
        System.out.println("remove 4 element");
        arrayList.remove(4);
        System.out.println("remove 0 element");
        arrayList.remove(0);
        System.out.println("remove last element");
        arrayList.remove(arrayList.size() - 1);

//        arrayList.remove(8);
        System.out.println("add 12 element");
        arrayList.add("12 element");

        System.out.println("size - " + arrayList.size());
//        arrayList.put("10 element");

        System.out.println("poll1 - " + arrayList.poll());
        System.out.println("poll2 - " + arrayList.poll());
        System.out.println("===============================");

        System.out.println("add 13 element");
        arrayList.add("13 element");
        System.out.println("poll" + arrayList.poll());
        System.out.println("size - " + arrayList.size());
        System.out.println("peek1" + arrayList.peek());
        System.out.println("peek2" + arrayList.peek());
        System.out.println("peek3" + arrayList.peek());
        System.out.println("size - " + arrayList.size());
    }
    private static void testLinkedList(){
        System.out.println("creating and adding 11 elements (first - \"first element\", last - \"11 element\"");
        LinkedList<String> arrayList = new LinkedList<>();
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
        System.out.println("size = " + arrayList.size());
//        arrayList.remove(10);
        System.out.println("remove 4 element");
        arrayList.remove(4);
        System.out.println("remove 0 element");
        arrayList.remove(0);
        System.out.println("remove last element");
        arrayList.remove(arrayList.size() - 1);
//        arrayList.remove(8);
        System.out.println("add 12 element");
        arrayList.add("12 element");

        System.out.println("size - " + arrayList.size());
//        arrayList.put("10 element");

    }
    }
