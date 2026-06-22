package problems_Multithreading;
class Balance{
    private int  balance = 10000;
    public synchronized void deposite(int amount){
        balance = balance + amount;
        System.out.println(Thread.currentThread().getName()+"-"+"deposite :"+amount+", " +"Balance :"+balance);
    }
    public synchronized void withdrawal(int amount){
        balance = balance - amount;
        System.out.println(Thread.currentThread().getName()+"-" +"withdrawal :" +amount+ ", "+"Balance :"+balance);
    }
    public int getResult(){
        return balance;
    }
}
public class Bank_problemRace {
    public static void main(String[] args) throws InterruptedException{
        Balance  b =  new Balance();
        Thread t1 = new Thread(() -> {
            for(int i =0; i<5; i++){
               b.deposite(1000);
            }
        });
        t1.start();

        Thread t2 = new Thread(() ->{
          for(int i=0; i<5; i++){
            b.withdrawal(500);
          }
        });
        t2.start();

        t1.join();
        t2.join();

        System.out.print("Final balance is :"+b.getResult());
    } 
}
