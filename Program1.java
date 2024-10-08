package MultiThreadingInJava;

public class Program1 {
    public static void main(String[] args) throws InterruptedException {
        ProducerConsumer pc=new ProducerConsumer();

     Thread t1=new Thread(new Runnable()
     {
         @Override
         public void run()
         {
             try {
                 pc.produce();
             } catch (InterruptedException e)
             {
                 throw new RuntimeException(e);
             }
         }
     });
     Thread t2=new Thread(new Runnable()
     {
         @Override
         public void run()
         {
             try {
                 pc.consume();
             } catch (InterruptedException e)
             {
                 throw new RuntimeException(e);

             }
         }
     });
                t1.start();
                t2.start();

                t1.join();
                t2.join();
    }
}
