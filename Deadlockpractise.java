package MultiThreadingInJava;

public class Deadlockpractise {
    final static String R1="hello meera";
    final static String R2="mehar hii";
    public static void main(String[] args)
    {
        Thread T1=new Thread()
        {
            public void run() {
                synchronized (R1) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("thread T1 and R1");
                    synchronized (R2) {
                            System.out.println("thread T1 and R2");
                        }
                    }
                }
        };
          Thread T2 =new Thread()
          {
              public void run()
              {
                  synchronized (R1) {
                      try {
                          Thread.sleep(2000);
                      } catch (InterruptedException e) {
                          throw new RuntimeException(e);
                      }
                      System.out.println("thread T2 and R2");

                      synchronized (R2) {
                          System.out.println("thread T2 and R1");
                      }
                  }
              }
        };
            T1.start();
            T2.start();
    }
}
