package problems_Multithreading;

class Theater{
    private int availableSeat = 20;

    public synchronized void bookSeat(String name, int seat){
        if(availableSeat >= seat){
            System.out.println("Booking successful for "+name);
            availableSeat -= seat;
            System.out.println("Now available seats are :"+availableSeat);
            System.out.println(); 
        }
        else{
            System.out.println("Booking unsuccessful for "+name);
        }
    }
}
public class Ticket_Booking {
    public static void main(String[] args) throws InterruptedException{
        Theater t = new Theater();
        Thread  c1 = new Thread(() -> {
            t.bookSeat("Aman", 10);
        });
         Thread  c2 = new Thread(() -> {
            t.bookSeat("Ankit", 4);
        });
         Thread  c3 = new Thread(() -> {
            t.bookSeat("Rahul", 1);
        });
         Thread  c4 = new Thread(() -> {
            t.bookSeat("Vikas", 6);
        });

        c1.start();
        c2.start();
        c3.start();
        c4.start();

        c1.join();
        c2.join();
        c3.join();
        c4.join();

        System.out.print("Booking completed");
    }

}
