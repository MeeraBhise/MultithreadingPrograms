package MultiThreadingInJava;

// extends thread class we create multithreading//
public class MultithreadingExample extends Thread
{
    @Override
    public /*synchronized*/ void run()
    {
        synchronized (MultithreadingExample.class)
        {
            for (int i = 0; i < 5; i++) {
                System.out.println("values of index is :" + "    " + i + "  " + "name of thread is :" + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException
    {
        MultithreadingExample obj1=new MultithreadingExample();
        obj1.setName("Thread1");
        MultithreadingExample obj2=new MultithreadingExample();
        obj2.setName("Thread2");
        MultithreadingExample obj3=new MultithreadingExample();
        obj3.setName("thread3");
        obj1.start();
        //obj1.join();l
        obj2.start();
        obj3.start();
       // obj3.join();
    }
}
