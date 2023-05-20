import static org.junit.jupiter.api.Assertions.*;

class HashTableTest {

    @org.junit.jupiter.api.Test
    void put() {
        HashTable<Integer, String> tb = new HashTable<Integer, String>();
        tb.put(1, "One");
        tb.put(2, "Two");
        tb.put(3, "Three");
        assertEquals("One", tb.get(1));
        assertEquals("Two", tb.get(2));
        assertEquals("Three", tb.get(3));

    }
}