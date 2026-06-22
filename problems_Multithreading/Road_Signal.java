package problems_Multithreading;
class Road extends Thread{
    private String roadName;

    Road(String roadName){
        this.roadName = roadName;
    }

    public void run(){
        try{
        System.out.println(roadName+"-"+"Green Signal");
        Thread.sleep(5000);
        System.out.println(roadName+"-"+"Green End");
        System.out.println("Yielding...>");
        Thread.yield();
        }
        catch(InterruptedException e){
            System.out.println("Exception occur");
        }
    }
}
public class Road_Signal {
    public static void main(String[] args){
        Road r1 = new Road("Road1");
        Road r2 = new Road("Road2");
        Road r3 = new Road("Road3");

        r1.start();
        r2.start();
        r3.start();
    }
}
