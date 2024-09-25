package MultiThreadingInJava;

public class Multithreadingexample2  implements Runnable{
 @Override
    public void run()
 {
     for(int i=0;i<2;i++){
         System.out.println("values of i is:"+i+"thread name is:"+Thread.currentThread().getName() );
     }
 }
    public static void main(String[] args)  throws InterruptedException {
     Multithreadingexample2 th=new Multithreadingexample2();
     Thread t=new Thread(th);
     t.setName("thread1");
        Multithreadingexample2 th1=new Multithreadingexample2();
        Thread t1=new Thread(th1);
        t1.setName("thread2");
        t.start();
        t.join();
        t1.start();
        t1.join();
 }
}
