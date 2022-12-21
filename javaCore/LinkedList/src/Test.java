
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
//
        MyLinkedList<Integer> ls = new MyLinkedList<Integer>();
//        LinkedList<Integer> l = new LinkedList<>();
        LinkedList<Long> ll = new LinkedList<>();


        // Test addFirst(),  pass
//        ls.addFirst(5);
//        ls.addFirst(4);
//        ls.addFirst(3);
//        ls.addFirst(2);
//        ls.addFirst(1);
//        System.out.println(ls.toString());
//        System.out.println("Size: "+ls.getSize());

        // Test addLast(),  pass
        ls.addLast(1);
        ls.addLast(2);
        ls.addLast(3);
        ls.addLast(4);
        ls.addLast(10);
        ls.addLast(6);
        ls.addLast(7);
        ls.addLast(null);
        ls.addLast(9);
        ls.addLast(10);
        ls.addLast(11);
        ls.addLast(12);
        ls.addLast(13);
        ls.addLast(14);
        ls.addLast(15);
        ls.addLast(null);
        ls.addLast(17);
        ls.addLast(18);
        ls.addLast(19);
        ls.addLast(20);
        System.out.println(ls.toString());
        System.out.println("Size: "+ls.getSize());

        // test deleteFirst , pass
//        System.out.println(ls.deleteFirst());
//        System.out.println(ls.toString());
//        System.out.println("Size: "+ls.getSize());

        // Test deleteLast , pass
//        System.out.println(ls.deleteLast());
//        System.out.println(ls.toString());
//        System.out.println("Size: "+ls.getSize());

        // Test max size, time => Max = 9999999
//        long n = 9999999l;
//        final  long starTime = System.currentTimeMillis();
//        for (long i = n; i >= 1 ;i--){
//            ls.addLast(i);
//        }
//        final  long endTime = System.currentTimeMillis();
//        System.out.println("Run time: "+(endTime - starTime)/1000 +"s");
//        System.out.println("Size: "+ls.getSize());
//        ls.showList();

        // Test indexOf(), pass
//        System.out.println("laction: "+ls.indexOf(10)); // pass
//        System.out.println("laction: "+ls.indexOf(100)); // pass
//        System.out.println("laction: "+ls.indexOf(null)); // pass

        // Test lastIndexOf() , pass
//        System.out.println("laction: "+ls.lastIndexOf(null)); // pass
//        System.out.println("laction: "+ls.lastIndexOf(10)); // pass
//        System.out.println("laction: "+ls.lastIndexOf(1000)); // pass

        // Test clear(), pass
//        ls.clear();
//        System.out.println(ls.toString());
//        System.out.println("Size: "+ls.getSize());
//        ls.addLast(100);
//        System.out.println(ls.toString());
//        System.out.println("Size: "+ls.getSize());

    }
}
