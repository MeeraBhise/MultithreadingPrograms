package MultiThreadingInJava;

public class ThreadExtendsTest extends Thread{
 /*   @Override
    public void run()
    {
        System.out.println("thread run method");
    }*/
    public static void main(String[] args) {
       ThreadExtendsTest thread =new ThreadExtendsTest();
      thread.start();
         thread.run();
    }
}
