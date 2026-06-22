package problems_Multithreading;
class Thread_1 extends Thread{
    // public Thread_1(Object object) {
    //     //TODO Auto-generated constructor stub
    // }

    public void run(){
        for(int i=1; i<=50; i++){
            System.out.println(Thread.currentThread().getName()+"-"+i);
        }
    }
}
class Thread_2 implements Runnable{
    public void run(){
        for(int j=51; j<=100; j++){
            System.out.println(Thread.currentThread().getName()+"-"+j);
        }
    }
}
public class Parallel_Number_Printer {
    public static void main(String[] args){
        
        Thread_1 t1 = new Thread_1();
        t1.start();

        Thread t2 = new Thread(new Thread_2());
        t2.start();
      try{
        t1.join();
        t2.join();
      }
      catch(InterruptedException e){
         System.out.println("thread interupted");
      }
      System.out.println("main end");
    }
}
