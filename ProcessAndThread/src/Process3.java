public class Process3 implements Runnable {
    private String name;
    private int count;

    public Process3(String name, int count) {
        this.name = name;
        this.count = count;
    }

    @Override
    public void run() {
        System.out.println("(Start) => "+ Thread.currentThread().getName() +" => "+ name);
        for (int i = 1; i <= count; i++) {
            System.out.println(Thread.currentThread().getName() + " => " + name + " => "+ i);
        }
        setTimeThread();
        System.out.println("(End) => " + name);
    }

    public void setTimeThread() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
