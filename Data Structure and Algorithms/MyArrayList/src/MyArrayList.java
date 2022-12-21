// TODO: 18/12/2022
/*
    ArrayList cơ chế và tốc độ truy xuất như mảng.
    Khác ArrayList có thể thay đổi kích thước lưu trữ
    mảng(array) thì không.

    add(T)
    add(index,T)
    remove(index)
    indexOf(T)
    lastIndex(T)
    clear();
    clone();
    get(index)
    set(index, T)
    sort
    toString()
    showArray()
 */
public class MyArrayList<T> {

    // KHai báo mảng nhớ
        private T[] arr;
        // khái báo kích thước
        private int size;


        /*
            Hàm khởi tạo mặc định
            khởi tạo mảng = 10 phần tử
            khởi tạo size = 0;
        */
        public MyArrayList() {
            this.arr = (T[]) new Object[10];
            this.size = 0;
        }

        /*
            Hàm khơi tạo có đối số,
            đối
        */
        public MyArrayList(int element) {
            this.arr = (T[]) new Object[element];
            this.size = 0;
        }

        public int getSize() {
            return this.size;
        }

        public int length() {
            return arr.length;
        }

        public void set(int index, T info) {
            if (index < 0 || index >= size) {
                System.out.println("Invalid index !");
                return;
            } else {
                this.arr[index] = info;
            }
        }

        public T get(int index) {
            if (index < 0 || index >= size) {
                System.out.println("Invalid index !");
                return null;
            }
            return (T) arr[index];
        }
    /*
        thêm một phần tử và sau vị mảng
        - Nếu khích thước (size) bằng với kích thước của mảng (arr.lengh)
            + tạo mảng mới (Temp) với chiều dài bằng kích thước nhân 2 (size + 10)
            + tạo vòng lặp for chuyển các phần tử mảng cũ (arr) sang mảng mới (temp)
            + Thoát khỏi vòng for gán lại mản arr = temp ( thay đổi địa chỉ vùng nhớ học c++ là biết)
        - Mảng không đầy.
            + vị trị index trong mảng bằng size và gán dữ liệu cho mảng ( arr[size] = info)
            + Tăng size lên 1 size++
            + có thể viết arr[size++] = info, gán giá trị rồi mới tăng size lên.
    */

        public void add(T info) {
            // Nếu mảng arr đầy
            if (size == arr.length) {
                // tạo mạng tạm có kích thước size * 2
                // hoặc size + 100 đỡ lãng phí bộ nhớ
                T[] temp = (T[]) new Object[size * 2];
                // gán phần tử mảng cũ sang mảng mới
                for (int i = 0; i < size; i++) {
                    temp[i] = arr[i];
                }
                // thay đổi địa chỉ vùng nhớ
                arr = temp;
            }
            // gán dữ liệu vào vị trí size và tăng sidfcgvnm ,.ze lên 1
            arr[size++] = info;
        }

        public void add(int index, T info) {
            if (index < 0 || index > size) {
                System.out.println("Invalid index !");
                return;
            }
            if (size == arr.length) {
                T[] temp = (T[]) new Object[size + 10];
                for (int i = 0; i < size; i++) {
                    if (index < size) {
                        temp[i] = arr[i];
                    } else if (index == size) {
                        temp[i] = info;
                    } else {
                        temp[i] = arr[i - 1];
                    }
                }
                arr = temp;
            } else {
                for (int i = size; i > index; i--) {
                    arr[i] = arr[i - 1];
                }
                arr[index] = info;
            }
            ++size;
        }

        public boolean remove(int index) {
            if (index < 0 || index >= size) {
                System.out.println("Invalid index");
                return false;
            } else {
                for (int i = index + 1; i < size; i++) {
                    arr[i - 1] = arr[i];
                }
                --size;
            }
            return true;
        }

        public boolean remove(Object object) {
            for (int i = 0; i < size; i++) {
                if (arr[i] == object) {
                    remove(i);
                    return true;
                }
            }
            return false;
        }

        public int indexOf(T info) {
            int index = -1;
            if (info == null) {
                for (int i = 0; i < size; i++) {
                    index++;
                    if (arr[i] == null) {
                        return index;
                    }

                }
            } else {
                for (int i = 0; i < size; i++) {
                    index++;
                    if (arr[i] == info) {
                        return index;
                    }
                }
            }
            return -1;
        }

        public int lastIndexOf(T info) {
            int index = size - 1;
            if (info == null) {
                for (int i = size - 1; i > 0; i--) {
                    if (arr[i] == null) {
                        return index;
                    }
                    index--;
                }
            } else {
                for (int i = size - 1; i > 0; i--) {
                    if (arr[i] == info) {
                        return index;
                    }
                    index--;
                }
            }
            return -1;
        }

        public void clear() {
            this.size = 0;
            arr = (T[]) new Object[10];
            ;
        }

//    public T[] clone() {
//        T[] temp = (T[]) new Object[size];
//        if (size == 0) {
//            int i = 0;
//            for (T item : arr) {
//                temp[i++] = item;
//            }
//        }
//        return temp;
//    }

        public String toString() {
            if (size != 0) {
                String result = "";
                for (int i = 0; i < size; i++) {
                    result += arr[i] + " ";
                }
                return result;
            }
            return null;
        }

        public void showArray(){
            if (size == 0) {
                System.out.println("Array null");
                return;
            }else {
                for (int i = 0 ;i<size;i++){
                    System.out.println(arr[i]);
                }
            }
        }
    }
