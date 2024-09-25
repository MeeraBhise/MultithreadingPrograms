package MultiThreadingInJava;
//using extends keyword or extends Thread class an create child thread class
//also i set priority for threads MIN_PRIORITY,MAX_PRIORITY,NORM_PRIORITY(1,10,5)
public class Thread1 extends Thread {
    @Override
    public void run()
    {
        System.out.println("run method");
        Thread.currentThread().setPriority(6);
        System.out.println("threadpriority:"+Thread.currentThread().getPriority());
    }
    public static void main(String args[]) {
        Thread1 tt = new Thread1();
        System.out.println(Thread.currentThread().getPriority());
        //tt.setPriority(MAX_PRIORITY);
       tt.start();
       tt.start();
      //  tt.run();
        //tt.setPriority(10);
       // System.out.println("thread ");

    }
}