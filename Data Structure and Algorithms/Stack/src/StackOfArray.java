
// TODO: 20/12/2022
/*
    Cách cài đặt stack bằng mảng.

    Ngăn sếp(Stack) vào sau ra trước (LIFO) phần tử cuối cùng
    được chèn vào ngăn xếp sẽ là phần tử đầu tiên được lấy ra khỏi ngăn xếp.

    empty() kiêm tra stack có rỗng hay ko
    push() Đẩy dữ liệu vào ngăn sếp
    pop() Lấy phần tử thêm vào cuối cùng ra(Top) và đồng thời xóa phần tử đó ra khỏi ngắn sếp.
    peek() Lấy phần tử thêm và cuối cùng(top) nhưng không xóa;
    search() tìm kiếm phần tử trong ngăn sếp;
    clear() xóa hết phần tứ trong stack.
    toString() chuyển tất cả các phần tử thành chuỗi.


*/
public class StackOfArray<T> {
    private  T[] arr;
    private  int size,top;

    public  StackOfArray(){
        this.arr = (T[]) new Object[100];
        this.top = -1;
        this.size = 0;
    }

    public  StackOfArray(int element){
        this.arr = (T[]) new Object[element];
        this.top = -1;
        this.size = 0;
    }
    public int getSize(){return this.size;}
    public int getTop(){return this.top;}

    public boolean empty(){
        return this.size == 0;
    }
    public boolean push(T info){
        if (size == arr.length){
            T[] temp = (T[]) new Object[size * 2];
            for (int i = 0; i <= top; i++){
                temp[i] = arr[i];
            }
            arr = temp;
        }else {
            arr[++top] = info;
            size++;
            return true;
        }
        return false;
    }

    public T pop(){
        if (size == 0) {
            System.out.println("Stack empty");
            return null;
        }
        T result = arr[top];
        arr[top--] = null;
        size--;
        return result;
    }

    public  T peek(){
        if(size == 0){
            System.out.println("Stack empty !");
            return null;
        }
        return arr[top];
    }

    public int search(T info){
        if(size != 0){
            if(info == null){
                for (int i = 0; i < size; i++){
                    if (arr[i] == null){
                        return i;
                    }
                }
            }else {
                for (int i = 0;i < size; i++){
                    if (arr[i] == info){
                        return i;
                    }
                }
            }
        }
        return -1;
    }

    public void clear(){
        this.size = 0;
        this.top = -1;
        this.arr = (T[]) new Object[10];
    }

    public String toString(){
        if (size == 0){
            System.out.println("Stack empty !");
            return "";
        }
        String result = "";
        for (int i = top; i >= 0; i--){
            result += arr[i] + " ";
        }
        return result;
    }
}
