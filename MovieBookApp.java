package MultiThreadingInJava;
class   ThreateBookSeats{
    int Total_Seats=10;
synchronized  public void SeatBooks (int seats)
    {
        if(Total_Seats>=seats)
        {
        System.out.println(seats+"seat booked successfully");
            Total_Seats=Total_Seats-seats;
            System.out.println("seats left"+Total_Seats);
        }
        else{
            System.out.println("sorry seats cannot booked ");
            System.out.println("seats left"+Total_Seats);
        }
    }


}
public class MovieBookApp extends Thread{
    static  ThreateBookSeats b;
    int seats;
  public  void run(){
      b.SeatBooks(seats);

    }
    public static void main(String[] args) {
         b=new ThreateBookSeats();
        MovieBookApp meera=new MovieBookApp();
        meera.seats=2;
        meera.start();
        /*try {
            meera.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/

        MovieBookApp Mehar=new MovieBookApp();
        Mehar.seats=7;
        Mehar.start();

    }
}
