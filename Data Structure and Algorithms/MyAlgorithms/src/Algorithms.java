public class Algorithms {
    /*
    Dãy fibonacci (Fn) hiểu đơn giản mỗi 1 số trong dãy là tổng 2 số trước đó
    yêu cầu n >= 2.

    */
    public static long fibonacci(long n){
        if(n < 2) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        fibonacci(5);
    }
}

