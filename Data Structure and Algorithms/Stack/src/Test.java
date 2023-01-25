
public class Test {
    public static void main(String[] args) {

    /*              Test Stack of Array                        */
//        StackOfArray<Integer> st = new StackOfArray<>();
//        System.out.println("top: "+st.getTop());
//        System.out.println("size: "+st.getSize());
//        st.push(10);
//        st.push(9);
//        st.push(8);
//        st.push(7);
//        st.push(6);
//        st.push(null);
//        st.push(4);
//        st.push(3);
//        st.push(2);
//        st.push(1);

        // Test pop(), getSize(),getTop(), pass
//        System.out.println("size: "+st.getSize());
//        System.out.println("top: "+st.getTop());
//        System.out.println(st.pop());
//        System.out.println(st.pop());
//        System.out.println(st.pop());
//        System.out.println(st.pop());
//        System.out.println(st.pop());
//        System.out.println(st.pop());
//        System.out.println("size: "+st.getSize());
//        System.out.println("top: "+st.getTop());
//        st.push(100);
//        System.out.println("size: "+st.getSize());
//        System.out.println("top: "+st.getTop());
//        System.out.println(st.pop());
//        System.out.println("size: "+st.getSize());
//        System.out.println("top: "+st.getTop());

        // Test // Test max size, Time => Max = 99999999, Time = 7s;
//        int n = 99999999;
//        final  long starTime = System.currentTimeMillis();
//        for (int i = 1; i <= n; i++){
//            st.push(i);
//        }
//        final  long endTime = System.currentTimeMillis();
//        System.out.println("Run time: "+(endTime - starTime)/1000 +"s");
//        for (int i = 1; i <= n; i++){
//            System.out.println("Size: "+st.getSize() +",Top: "+st.getTop() + " => "+st.pop());
//        }

        // Test peek(), pass
//        System.out.println(st.peek());
//        System.out.println("top: "+st.getTop());
//        System.out.println("size: "+st.getSize());

        // Test search()
//        System.out.println("Laction: "+st.search(null));
//        System.out.println("Laction: "+st.search(9));

        // Test toString(), pass
//        System.out.println(st.toString());

  /************************************************************************************/
     /*               Test Stack Of LinkedList                   */
        StackOfLinkedList<Integer> ls2 = new StackOfLinkedList<>();

        // Test hàm kiểm tra stack có rỗng hay không,  pass
//        System.out.println(ls2.empty());
//        ls2.push(1);
//        System.out.println(ls2.empty());

        // Test push,  pass
        ls2.push(100);
        ls2.push(null);
        ls2.push(3);
        ls2.push(4);
        ls2.push(5);
        ls2.push(1);
        ls2.push(10);
        ls2.push(12);
        ls2.push(11);
        ls2.push(200);
//        ls2.printList();
        System.out.println("Size: "+ls2.getSize());
        System.out.println(ls2.toString());

        // Test pop() false 1 size = 0, không xóa được.
//        ls2.pop();
//        System.out.println();
//        System.out.println("Size: "+ls2.getSize());
//        System.out.println(ls2.toString());

        // Test peek(), pass
//        System.out.println(ls2.peek());


    }
}
