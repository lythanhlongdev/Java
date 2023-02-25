public class Dequy {


    /*
    Cách 1: Tính bằng đệ quy
    Dãy fibonacci (Fn) hiểu đơn giản mỗi 1 số trong dãy là tổng 2 số trước đó
    yêu cầu n >= 2.
    */
    public static long fibonacci(long n) {
        if (n < 2) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    /*
     Cách 2: Tính bằng quy hoạc động.
    */
    static  long f [] = new long[1000];
    public static long dynamicFibonacci(long n){
        if (f[(int) n] != -1l) return f[(int) n];
        if (n == 0 || n == 1)return f[(int) n] = 1;
        f[(int) n] = dynamicFibonacci(n - 1) + dynamicFibonacci(n - 2);
        return f[(int) n];

    }
    /*
    n = (n - 1) * ((n-1) - 1)
    VD  n = 5
    n = (5-1) * (4 -1) * (3 - 1) * (2-1) * (1 - 1) * 0
    Điểm dưng de quy là 1
    */
    public static long giaThua(long n) {
        if (n == 1) return 1;
        return n * giaThua(n - 1);
    }

    /*
      Bài toán toán không thể xác định được số lần thực thi
      Ông Lothar Clolatz July 6, 1910 – September 26, 1990.

      Thập toán
      Nếu n số chắn chia cho 2
      Nếu n số lẻ thì nhân n cho 3 và công 1

      Dùng dệ quy
      tránh tình trạng treo trường trinh ta nên return nếu n = 1

    */

    static int count = -1;
    static String s = "";
    public static void lotharClolatz(int n) {
        s += n +" ";
        count++;
        if (n == 1) return;
        if (n % 2 == 0) lotharClolatz(n / 2);
        else lotharClolatz(n * 3 + 1);
    }
    public static void showLotharClolatz(int n){
        lotharClolatz(n);
        System.out.println(s);
        System.out.println(count);
    }

    public static void main(String[] args) {
        for (int i = 0; i < f.length; i++){
            f[i] = -1;
        }

//        System.out.println("Finbonacci: " + fibonacci(50));
        System.out.println("Dynamic Finbonacci: " + dynamicFibonacci(500l));
//        System.out.println("Gai Thua: " + giaThua(5));
//        System.out.println("Show Lothar Clolatz: ");
//        showLotharClolatz(27);

    }
}

