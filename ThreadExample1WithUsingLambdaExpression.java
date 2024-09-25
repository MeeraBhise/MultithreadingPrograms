package MultiThreadingInJava;

/*public class ThreadsExample1 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("child thread");
        }
    }
}*/
/*
class test{
    public static void main(String[] args) {

        Runnable r=()->{
          for(int i=0;i<10;i++)
          {
              System.out.println("child thread-1");
          }
        };
      //ThreadsExample1 s=new ThreadsExample1();
      Thread  t=new Thread(r);
      t.start();
      for(int i=0;i<10;i++)
      {
          System.out.println(" Main thread-1");
      }
    }
}


*/

public class ThreadExample1WithUsingLambdaExpression implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<10;i++)
        {
            System.out.println("child thread");
        }
    }
}

class  Test{
    public static void main(String[] args) {
    Runnable r= ()->{
      for(int i=0;i<10;i++)
      {
          System.out.println("child Thread-1");
      }
    };
  //  ThreadExample1 s=new ThreadExample1();
      Thread t=new Thread(r);
      t.start();
      for(int i=0;i<10;i++)
      {
          System.out.println("main thread -1");
      }
    }
}






































