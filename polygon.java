package MultiThreadingInJava;

public class polygon {
    public void display()
    {
        System.out.println("polygon class display");
    }
    public void dummy()
    {
        System.out.println("polygon class dummy");
    }
}
class anonymousdemo{
    public void createclass(){
        polygon p1=new polygon(){
public void display()
{
    System.out.println("anonymousdemo display");
}
public void dummy()
{
    System.out.println("anonymousdemo dummy");
}
        };
p1.display();
p1.dummy();
    }
}
 class AnanoumusClass{
    public static void main(String[] args) {
        anonymousdemo s=new anonymousdemo();
        s.createclass();
    }
}
