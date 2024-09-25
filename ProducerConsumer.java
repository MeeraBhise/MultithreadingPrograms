package MultiThreadingInJava;
import java.util.LinkedList;
public class ProducerConsumer
{
    LinkedList<Integer> list=new LinkedList<>();
    public void produce() throws InterruptedException
    {
        int value=0;
         while(true)
      {
          synchronized (this)
          {
              while (list.size() > 0)
                  wait();
              System.out.println("produced data :"+value);
              list.add(value);
              value ++;
              notify();
              Thread.sleep(1000);
          }
       }
    }
    public void  consume() throws InterruptedException
    {
        while(true)
        {
            synchronized (this)
            {
                while(list.size()==0)
                  wait();
                int value =list.removeFirst();
                System.out.println("consumer :"+value);
                notify();
                Thread.sleep(1000);
            }
        }
    }
}
