package MultiThreadingInJava;

public class SleepMethodDemo  extends Thread{
     public void run()
     {
         System.out.println("run method");
         for(int i=0;i<3;i++){
             System.out.println(i);
             System.out.println(Thread.currentThread().isInterrupted());
             try {
                 Thread.sleep(2000);
             } catch (InterruptedException e) {
                 throw new RuntimeException(e);
             }
         }
     }

    public static void main(String[] args) {
     SleepMethodDemo s=new SleepMethodDemo();
     s.start();
     s.isInterrupted();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().isInterrupted());
    }

}
