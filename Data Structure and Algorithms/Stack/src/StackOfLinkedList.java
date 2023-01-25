// TODO: 20/12/2022
/*
    Cách cài đặt stack Danh sách liên kết đơn LinkedList.

    Ngăn sếp(Stack) vào sau ra trước (LIFO) phần tử cuối cùng
    được chèn vào ngăn xếp sẽ là phần tử đầu tiên được lấy ra khỏi ngăn xếp.

    empty() kiêm tra stack có rỗng hay ko
    push() Đẩy dữ liệu vào ngăn sếp
    pop() Lấy phần tử thêm vào cuối cùng ra(Top) và đồng thời xóa phần tử đó ra khỏi ngắn sếp.
    peek() Lấy phần tử thêm và cuối cùng(top) nhưng không xóa;
    search() tìm kiếm phần tử trong ngăn sếp;
    clear() xóa hết phần tứ trong stack.
    toString() chuyển tất cả các phần tử thành chuỗi.
    printList() xuất hết thông tin trong list.


*/
public class StackOfLinkedList<T> {
    private class Node {
        private T info;
        private Node next;

        public Node(T info) {
            this.info = info;
            this.next = null;
        }

        public T getInfo() {
            return info;
        }
    }

    private Node first, last;
    private int size;

    public StackOfLinkedList() {
        this.first = this.last = null;
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean empty() {
        return this.size == 0;
    }

    public void push(T info) {
        try {
            // not null
            if(info == null) return;
            Node temp = new Node(info);
            if (size == 0) {
                this.first = this.last = temp;
            } else {
                this.last.next = temp;
                this.last = temp;
            }
            ++size;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // vẫn còn lỗi. size = 1 ko xóa đc.
    public T pop(){
        if (this.size != 0){
            Node run = this.first;
            Node temp = this.last;
            //  bug ở đây.
            while (run != null){
                if (run.next == last){
                    run.next = null;
                    last = run;
                    --size;
                    return temp.getInfo();
                }
                run = run.next;
            }
        }
        return null;
    }

    public T peek(){
        if (size == 0)return null;
        return this.last.getInfo();
    }

    // false
//    public boolean search(T info){
//        if (size == 0)return false;
//        Node run = first;
//        while (run != null){
//            if (run.info == info){
//                return true;
//            }
//            run = run.next;
//        }
//        return false;
//    }

    @Override
    public String toString() {
        if (first != null) {
            String result = "";
            Node run = first;
            while (run != null) {
                result += run.info + " ";
                run = run.next;
            }
            return result;
        }
        return null;
    }

    public void printList(){
        if (this.size != 0){
            Node runner = this.first;
            while (runner != null){
                System.out.println(runner.getInfo());
                runner = runner.next;
            }
        }else {
            System.out.println("Stack Empty !");
        }
    }
}
