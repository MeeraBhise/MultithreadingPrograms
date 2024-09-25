package MultiThreadingInJava;

public class PractiseDaemonThread  extends Thread{
    @Override
    public void run()
    {
       // System.out.println("child thread ");
        if(Thread.currentThread().isDaemon())
        {
        System.out.println("daemon thread");
    }
    else{
        System.out.println("child thread");
    }
    }
    public static void main(String[] args) {
        PractiseDaemonThread t=new PractiseDaemonThread();
        t.setDaemon(true);
      //  System.out.println("main thread");
        t.start();
      //  System.out.println(Thread.currentThread().getName());


    }
}
