package MultiThreadingInJava;

public class ThreadBasicMetrhods  extends Thread
{
    public void run()
    {
        Thread.currentThread().setName("meera");
        System.out.println("test run");
        System.out.println(getName());
    }

    public static void main(String[] args) {
        ThreadBasicMetrhods t1=new ThreadBasicMetrhods();
        t1.start();
    }
}
