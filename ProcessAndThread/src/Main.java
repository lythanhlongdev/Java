import runnable.Process1;
import thread.Process2;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
      MultilTask {Process1, Process2,Process3,..n};
      Process {Thread1, Thread2, Thread3,...n}
      MultilTask > MultilProcess > MultilThreading
*/
public class Main {
    public static void main(String[] args) {
//        // Using interface Runnable
//       Runnable r1 = new Process1("A",100);
//       Runnable r2 = new Process1("B",100);
//
//       // MuntilThreading = 2
//       Thread t1 = new Thread(r1);
//       Thread t2 = new Thread(r2);
//       // star
//        t1.start();
//        t2.start();

        // extends  class Thread
//        Thread t1 = new Process2("A",5);
//        Thread t2 = new Process2("B", 5);
//        // Thread
//        t1.start();
//        t2.start();
        // not Thread
//        t1.run();
//        t2.run();

        // Thread Pool
        // star max 5 thread
//        ExecutorService ex = Executors.newFixedThreadPool(5);
//            ex.execute(new Process3("A",10));
//            ex.execute(new Process3("B",10));
//            ex.execute(new Process3("C",10));
//            ex.execute(new Process3("D",10));
//            ex.execute(new Process3("E",10));
//            ex.execute(new Process3("F",10));
//            ex.execute(new Process3("G",10));
//            ex.execute(new Process3("H",10));
//            ex.execute(new Process3("I",10));
//            ex.execute(new Process3("K",10));
//        ex.shutdown();
    }
}