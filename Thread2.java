package MultiThreadingInJava;

// using runnable interface
//When we implements Runnable it instance of Runnable and then we need to that runnable instance
//to Thread class constructor,so that we get instance of Thread.
public class Thread2 implements Runnable{
     void test()
     {
         System.out.println("test");
     }
    @Override
    public void run()
    {
        System.out.println("run");
    }
 /*   public void run(int a){
        System.out.println("java overloading");
    }*/
    public static void main(String[] args) {
        Thread2 t=new Thread2();
        Thread tt=new Thread(t,"meera");
        tt.start();
      //  t.run(50);
        t.test();
     // if(t instanceof Thread){}  // false
       // if(t instanceof Runnable){} //true
        //if(tt instanceof Thread){}   //true
    }
}
