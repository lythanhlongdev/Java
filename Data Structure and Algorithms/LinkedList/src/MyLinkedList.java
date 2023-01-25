// TODO: 19/12/2022
/*
    Linkedlist
    Ưu điểm:
        + Tiết kiếm bộ nhớ và cấp phát động: Không như array cần 1
          lượng chỉ định ô nhớ trên bộ nhớ ngay khi khỏi tạo Linkedlist
          chỉ sử dụng bộ nhớ để lưu trữ khi dữ liệu thực sự được lưu vào linked list.
        + Nó còn có thể lưu các phần tử ở bất cứ đâu được phép trên bộ nhớ mà
          không cần các ô nhớ liền kề nhau như array
        + Thêm rất nhanh complexity O(1)
        + Xóa nhanh
    Nhược điểm:
        + tìm kiếm lâu phải duyệt qua các phần tử O(n)

   Các function sẽ được cài đặt lại
       addFirst(T)
       addLast(T)
       deleteFirst()
       deleteLast();
       getFirst();
       getLast();
       toString();
       showList();
*/
public class MyLinkedList<T> {
    private class Node {
        private T info;
        private Node next;

        public Node(T info) {
            this.info = info;
            this.next = null;
        }
    }

    private Node first, last;
    private long size;

    public MyLinkedList() {
        this.size = 0;
        this.first = this.last = null;
    }

    public long getSize() {
        return size;
    }

    public T getFirst() {
        if (size == 0) return null;
        return first.info;
    }

    public T getLast() {
        if (size == 0) return null;
        return last.info;
    }

    public void addFirst(T info) {
        Node newNode = new Node(info);
        if (size == 0) {
            first = last = newNode;
        } else {
            newNode.next = first;
            first = newNode;
        }
        ++size;
    }

    public void addLast(T info) {
        Node newNode = new Node(info);
        if (size == 0) {
            first = last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        ++size;
    }

    public boolean deleteFirst() {
        if (size != 0) {
            first = first.next;
            size--;
            return true;
        }
        return false;
    }

    public boolean deleteLast() {
        if (size != 0) {
            if(size == 1){

            }
            Node run = first;
            while (run != null) {
                if (run.next == last) {
                    run.next = null;
                    last = run;
                    size--;
                    return true;
                }
                run = run.next;
            }
        }
        return false;
    }

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

    public void showList() {
        if (size == 0) {
            System.out.println("List null !");
            return;
        } else {
            Node run = first;
            while (run != null) {
                System.out.println(run.info);
                run = run.next;
            }
        }
    }

    public int indexOf(T info) {
        // size lớn hơn 1 mới tìm
        if (size != 0) {
            int index = 1;
            Node run = first;
            if (info == null) {
                while (run != null) {
                    if (run.info == null) {
                        return index;
                    }
                    index++;
                    run = run.next;
                }
            } else {
                while (run != null) {
                    if (run.info == info) {
                        return index;
                    }
                    index++;
                    run = run.next;
                }
            }
        }
        return -1;
    }

    public int lastIndexOf(T info) {
        if (size != 0){
            Node run = first;
            int temp = -1, index = 1;
            if(info == null){
                while (run != null){
                    if (run.info == null){
                        temp = index;
                    }
                    index++;
                    run = run.next;
                }
                return temp;
            }else {
                while (run != null){
                    if (run.info == info){
                        temp = index;
                    }
                    index++;
                    run = run.next;
                }
                return temp;
            }
        }
        return -1;
    }

    public void clear(){
        this.size = 0;
        this.first = this.last = null;
    }

}
