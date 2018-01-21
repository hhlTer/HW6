package homework6;

public class HashMap<K, V> {

    private int size = 0;
    private Essence firstEssence;
    private Essence currentEssence;
    private Essence tempEssence;

    HashMap(){}
    HashMap(K key, V val){
        addFirst(key, val);
    }

    private void addFirst(K key, V val){
        firstEssence = new Essence(key, val);
        currentEssence = firstEssence;
        size++;
    }
    public void put(K key, V value){
        if (size==0) {      //only if first adding;
            addFirst(key, value);
        }
        if (has(key)){
            tempEssence.value = value;
            return;
        }
            this.currentEssence = new Essence(key, value, currentEssence);
            size++;
    }
    public V get(K key){
        if (has(key)) return tempEssence.value;
        else throw new NullPointerException();
    }

    public void remove(K key){
        if (has(key)){
            tempEssence.prev.next = tempEssence.next;
            tempEssence.next.prev = tempEssence.prev;
            size--;
        } else throw new NullPointerException();
    }
    public void clear(){
        if (size == 0) return;
        currentEssence.prev = null;
        currentEssence.next = null;
        currentEssence.key = null;
        currentEssence.value = null;
        firstEssence.prev = null;
        firstEssence.next = null;
        firstEssence.key = null;
        firstEssence.value = null;
        size = 0;
    }

    /**
     * tempEssence - essence, with has request key.
     *               can be using for eny operation with finding essence
     *               (put, remove, get)
     */
    public boolean has(K key) {
        Essence temp = firstEssence;
        int count = size;
        while (!temp.key.equals(key)) {
            if (--count == 0) break;
            temp = temp.next;
        }
        boolean b = temp.key.equals(key);
        if (b) tempEssence = temp;
        return (b);
    }
    public int size(){
       return size;
    }

    class Essence{
        K key;
        V value;

        Essence prev;
        Essence next;

        /**
         * Called, only when creating first element;
         * Викликається тількі, якщо створюється перший елемент(if (size == 0))
         */
        Essence(K key, V value){
            this.key = key;
            this.value = value;
            prev = null;
            next = null;
        }

        /**
         *
         * @param cE - transmitted currentElement for following and transformation
         */
        Essence(K key, V value, Essence cE){
            cE.next = this;
            this.key = key;
            this.value = value;
            this.prev = cE;
            this.next = null;
        }

    }
}
