package Design_Patterns;
class SingletonDemo{
    private static SingletonDemo instance; 
//-->instance variable ek object reference store karega.
    //Static variable class se belong karta hai, object se nahi.
    // Agar static nahi hota to har object ka alag instance variable hota.
    //-->Singleton pattern me hume poori class ke liye ek hi reference chahiye, isliye static.-->
    //private isliye kiye hai , taki bhar se isko access krke reference change na kr de.-->


    private SingletonDemo(){
        System.out.println("Singleton instance created");
    }
    // important.
    // constructor private hai, isliye koi bhi class isko directly access nahi kar sakti
    // aur na hi is class ka  object bana sakti hai.

    public static SingletonDemo getInstance(){
        if(instance == null){
            instance = new SingletonDemo();
        }
        return instance;
    }
    // Ye method object return karega.
    // static isliye taki bina object ke ise call krke object reference le sake.

    void show(){
        System.out.println("Hello from Singleton class");
    }
}
public class Singleton{
    public static void main(String[] args){
        SingletonDemo s1 = SingletonDemo.getInstance();
        SingletonDemo s2 = SingletonDemo.getInstance();

        s1.show();

        System.out.println(s1 == s2);
    }
}