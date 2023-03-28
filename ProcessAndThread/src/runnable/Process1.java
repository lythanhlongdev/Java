package runnable;

public class Process1 implements Runnable{
    private String name;
    private int count;
    public  Process1(String name, int count){
        this.name = name;
        this.count = count;
    }
    @Override
    public void run() {
        try {
            for (int i = 0; i <= count; i++){
                Thread.currentThread().setName("Load "+name);
                System.out.println(Thread.currentThread().getName() + " "+i);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
