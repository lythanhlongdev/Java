public class Test {
    public static void main(String[] args) {
        User thanhLong = new User("112233","MB-Bank","2323","Ly Thanh Long","11120123979999",100.000);
        Thread t1 = new Withdrawal(thanhLong);
        Thread t2 = new Withdrawal(thanhLong);
        Thread t3 = new Withdrawal(thanhLong);
        t1.start();
        t2.start();
        t3.start();
    }
}
