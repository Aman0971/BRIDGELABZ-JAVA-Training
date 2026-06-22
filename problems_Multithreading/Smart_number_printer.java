package problems_Multithreading;
class Fifty  extends Thread{
    public  void run(){
        for(int i=1; i<=50; i++){
            System.out.println(Thread.currentThread().getName()+"-"+i);
        }
    }
}
class Hundread implements Runnable{
    public void run(){
        for(int i=51; i<=100; i++){
            System.out.println(Thread.currentThread().getName()+"-"+i);
        }
    }
}
class Alphabate{
    public void printAlphabate(){
        for(int i =0; i<26; i++){
          System.out.println((char)(i+65));
        }
    }
}
public class Smart_number_printer {
     public static void main(String[] args) throws InterruptedException{
        Fifty A = new Fifty();
       
        Hundread H = new Hundread();
        Thread B = new Thread(H);
        
        Alphabate alpha = new Alphabate();
        Thread C = new Thread(() ->{
          alpha.printAlphabate();
        });
        A.start();
        B.start();
        C.start();
        
        A.join();
        B.join();
        C.join();

        System.out.println("Process Completed !");
    }
}
