import java.util.ArrayList;

public class MyHashMap<K, V> {
    private class MyHashTabe {


        private K key;
        private V value;

        public MyHashTabe(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        @Override
        public boolean equals(Object obj) {
            if (this.key == ((MyHashTabe) obj).key && this.value == ((MyHashTabe) obj).value) {
                return true;
            }
            return false;
        }

        public void setValue(V value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "\n[" + this.key + ", " + this.value + "]";
        }
    }

    private ArrayList<MyHashTabe> arrayHashTabe;

    public MyHashMap() {
        arrayHashTabe = new ArrayList<MyHashTabe>();
    }
    public void put(K key, V value) {
        MyHashTabe newHab = new MyHashTabe(key,value);
        for (int i = 0; i < arrayHashTabe.size(); i++){
            if (arrayHashTabe.get(i).equals(newHab)){
                System.out.println("Object already exists !");
                return;
            }else if(arrayHashTabe.get(i).key == key){
                System.out.println(key+" already exists !");
                return;
            }
        }
        arrayHashTabe.add(newHab);
    }


    public void printHashMap(){
        arrayHashTabe.forEach((n)-> System.out.println(n.toString()));
    }
}
