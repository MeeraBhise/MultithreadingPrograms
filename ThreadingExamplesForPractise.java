package MultiThreadingInJava;

public class ThreadingExamplesForPractise {
    public static void main(String[] args) {
        System.out.println("hello");
       System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("meera");
        System.out.println(Thread.currentThread().getName());
       // int c= 10/0;

    }
}
