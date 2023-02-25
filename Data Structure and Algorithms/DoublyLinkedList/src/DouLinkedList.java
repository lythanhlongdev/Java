
/*
    Dánh sách liên kết đôi gồm 3 thành phần, data, prev, next.
    - Data chứa dữ liệu của 1 node.
    - Next chứa địa chỉ của node tiếp theo liền sau.
    - Prev chứa địa chỉ của node liền trước
* */
public class DouLinkedList <T>{
    private  class Node {
        private  T data;
        private  Node prev, next;
        public Node(T data){
            this.data = data;
            this.prev = this.next = null;
        }

        public Node(T data, Node prev, Node next) {
            data = data;
            this.prev = prev;
            this.next = next;
        }
    }
    private  Node head, tail;
    private int size;
    public DouLinkedList(){
        this.head = this.tail = null;
        this.size = 0;
    }

    public void addFirst(T data){
        Node newNode = new Node(data);
        if (size == 0){
            this.head = this.tail = newNode;
            ++size;
        }else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            ++size;
        }
    }

    public void addLast(T data){
        Node newNode = new Node(data);
        if (size == 0){
            this.head = this.tail = newNode;
            ++size;
        }else {
            this.tail.next = newNode;
            newNode.prev = this.tail;
            tail = newNode;
            ++size;
        }

    }
    public void printList(){
        if (size == 0){
            System.out.println("List isEmpty !");
        }else {
            // xuất theo chiều next
            String out = "";
            Node run = this.head;
            while (run != null){
                out += run.data +" ";
                run = run.next;
            }
            System.out.println("Next: => "+out);

            // xuất ngược danh sách
            out = "";
            run = this.tail;
            while (run != null){
                out += run.data +" ";
                run = run.prev;
            }
            System.out.println("Prev: => "+out);
        }
    }
}
