import java.util.LinkedList;

public class HashTable<K, V> {

    // kiểm tra mảng đầy bao nhiêu %
    private final static double LOAD_FACTOR = 0.75;

    // Mặc định khởi tạo mảng 10 phần tử.
    private final static int INITIAL_CAPACITY = 10;

    // Mã code + với key Đã HashCode
    private final static int HASH_CODE = 11122001;

    // số lượng phần tử trong mảng
    private int size;

    // Một mảng danh sách liên kết đơn chưa bucket => đối tượng
    private LinkedList<Bucket<K, V>> table[];

    public HashTable() {
        // Khởi tạo mặc định mảng 10 INITIAL_CAPACITY
        this(INITIAL_CAPACITY);
    }

    public HashTable(int capacity) {
        this.table = new LinkedList[capacity];
        this.size = 0;
    }


    // kiểm tra số lượng phần tử trong mảng
    public int size() {
        return size;
    }

    // kiểm tra mảng danh sách liên kết đơn còn trống hay không
    public boolean isEmpty() {
        return size == 0;
    }


    /*
        Hàm băm băm key thành 1 số nguyên nhỏ hơn độ dài của mảng length
    * */
    private int hash(K key) {
        int hashCode = key.hashCode();
        int index = (hashCode + HASH_CODE) % table.length;
        if (index < 0) {
            index += table.length;
        }
        return index;
    }

    public void put(K key, V value) {
        int index = this.hash(key);
        if (table[index] == null) {
            table[index] = new LinkedList<>();
        }
        LinkedList<Bucket<K, V>> chain = table[index];
        for (Bucket<K, V> item : chain) {
            if (item.getKey().equals(key)) {
                item.setValue(value);
                return;
            }
        }
        chain.add(new Bucket(key, value));
        size++;
        if ((double) size / table.length > LOAD_FACTOR) {
            this.resize();
        }
    }

    private void resize() {
        LinkedList<Bucket<K, V>>[] oldTable = table;
        table = new LinkedList[oldTable.length * 2];
        size = 0;
        for (LinkedList<Bucket<K, V>> chain : oldTable) {
            if (chain != null) {
                for (Bucket<K, V> item : chain) {
                    put(item.key, item.value);
                }
            }
        }
    }

    public V get(K key) {
        int index = hash(key);
        LinkedList<Bucket<K, V>> chain = table[index];
        if (chain != null) {
            for (Bucket<K, V> item : chain) {
                if (item.getKey() == key) {
                    return item.getValue();
                }
            }
        }
        return null;
    }


    private class Bucket<K, V> {
        final K key;
        V value;

        public Bucket(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }
}
