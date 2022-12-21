import java.util.ArrayList;

// TODO: 20/12/2022
/*
    Hàng đợi (Queue) cơ chế vào trước ra trước (FiFO),
    như bạn sếp hàng đợi mua vé xem phim.

    add() thêm 1 phần tử vô trước
    Hoàn Thành sau

*/
public class QueueOfArray<T>{
    private T[] arr;
    private int first, last, size;

    public QueueOfArray() {
        this.arr = (T[]) new Object[100];
        this.first = last = this.size = 0;
    }

    public boolean empty() {
        return this.size == 0;
    }

    public void offer(T info) {
        if (size == arr.length) {
            T[] temp = (T[]) new Object[size * 2];
            for (int i = 0; i < size; i++) {
                temp[i] = arr[i];
            }
            arr = temp;
        }
        arr[last++] = info;
        size++;
    }

    public T poll() {
        if (size == 0) {
            System.out.println("Queue empty !");
            return null;
        }
        return arr[first];
    }

    public String toString() {
        String result = "";
        if (size == 0) {
            System.out.println("Queue empty !");
            return result;
        }

        for (int i = 0; i < size; i++) {
            result += arr[i] + " ";
        }
        return result;
    }
}
