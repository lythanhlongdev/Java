public class Withdrawal extends Thread {
    private  User user;
    public Withdrawal(User user){
        this.user = user;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName());
            this.user.withdrawal(50.000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
