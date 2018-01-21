package homework6;

public class HashMap<K, V> {

    private int size = 0;
    private Essence firstEssence;
    private Essence currentEssence;

    HashMap(){}
    HashMap(K key, V val){
        addFirst(key, val);
    }

    private void addFirst(K key, V val){
        firstEssence = new Essence(key, val);
        currentEssence = firstEssence;
        size++;
    }
    public void add(K key, V value){
        if (size==0) addFirst(key, value);
        else {
            int count = -1;
            Essence e = firstEssence;
            do {
                count++;
                if (key.equals(e.key)){
                    e.value = value;
                    return;
                }
                e = e.next;
            } while (count <= size);

            this.currentEssence = new Essence(key, value, currentEssence);
            size++;
        }
    }
    public V get(K key){
        Essence temp = firstEssence;
        int count = -1;
        while (!temp.key.equals(key) || !temp.key.equals(currentEssence.key)){
            temp = temp.next;
        }
        if (temp.key.equals(key)) return (V)temp.value;
        else throw new NullPointerException();
    }

    public void remove(K key){
        Essence temp = firstEssence;
        int count = size;
        while (!temp.key.equals(key) || count!=0){
            temp = temp.next;
            count--;
        }
        if (temp.key.equals(key)){
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
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

    public boolean has(K key){
        Essence temp = firstEssence;
        int count = size;
        while (!temp.key.equals(key) || count >= 0){
            temp = temp.next;
            count--;
        }
        return  (temp.key.equals(key));
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
