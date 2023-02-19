public class SearchOfArray {

    /*
        Binary seacrch Tìm kiếm nghị phân dùng vòng lặp.
        * Lưu ý mảng phải được sắp sếp trước khi tìm kiếm.

        - Tham số chyển vào: mảng và  x => x là số cần tìm trong mảng.
        - khởi tạo 3 biến mid, left, right.
        - left bằng 0.
        - right bằng chiều dài của mảng - 1, array.lenth - 1.
        - Tạo vòng lặp kiểm tra chừng nào left nhỏ hơn hoặc bằng right thì tiếp tục lặp.
           *** Thuật toán. trong vòng lặp
           - Gán mid bằng left công right chia 2.
           - Nếu x bằng với giá trị của mảng tại vị trí mid => trả về mid.
           - Nếu x lớn hơn giá trị của mảng tại vị trí mid => gán left bằng mid công 1;
           - Ngược lại gán right bằng mid - 1.
        - Thoát khỏi vòng lặp nếu không tìm thấy trả về -1.

         Độ phức tạp O(n) nếu điều kiện thuật lợi O(1)
    */
    public static int binarySearch(int[] array, int x){
        int mid, left = 0, right = array.length - 1;
        while (left <= right){
            mid = (left + right)/2;
            if (x == array[mid])return mid;
            if (x > array[mid]) left = mid + 1;
            else  right = mid - 1;
        }
        return  - 1;
    }

    public static  int dequyBanarySeach(int [] array, int left, int right,int x){
        int mid = (left + right)/2;
        if (x == array[mid])return mid;
        if (x > array[mid]){
           dequyBanarySeach(array, (mid + 1),right,x);
        }else dequyBanarySeach(array,left,(mid - 1),x);
        return -1;

    }

    public static void main(String[] args) {
        int arr[] ={0,1,2,3,4,5,6,7,8,9,10,11,100,2001,3000};
//        binarySearch(arr,1);
//        System.out.println(binarySearch(arr,1));
        System.out.println(dequyBanarySeach(arr,0,arr.length,9));
    }
}
