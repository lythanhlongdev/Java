public class Test {


    public static void main(String[] args) {
        HashTable<String, Person> tb = new HashTable<String, Person>();
        System.out.println(tb.isEmpty());
        System.out.println(tb.size());
        tb.put("pserson1",new Person("021105","Ly Thanh Long",22));
        tb.put("pserson2",new Person("021105","Ly Thanh Long",22));
        tb.put("pserson3",new Person("021105","Ly Thanh Long",22));
        tb.put("pserson4",new Person("021105","Ly Thanh Long",22));
        tb.put("pserson5",new Person("021105","Ly Thanh Long",22));
        tb.put("pserson6",new Person("021105","Ly Thanh Long",22));
        tb.put("pserson7",new Person("021105","Ly Thanh Long",22));
        tb.put("pserson8",new Person("021105","Ly Thanh Long",22));
        tb.put("pserson9",new Person("021105","Ly Thanh Long",22));
        tb.put("pserson10",new Person("021105","Ly Thanh Long",22));

        System.out.println(tb.isEmpty());
        System.out.println(tb.size());
    }
}
