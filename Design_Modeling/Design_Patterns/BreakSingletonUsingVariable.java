package Design_Patterns;

class BreakSingleton{
    public static BreakSingleton instance;

    private BreakSingleton(){
        System.out.println("BreakSingleton instance created");
    }
    
    public static BreakSingleton getInstance(){
        if(instance == null){
            instance = new BreakSingleton();
        }
        return instance;
    }
}

public class BreakSingletonUsingVariable {
      public static void main(String[] args){
        BreakSingleton s1 = BreakSingleton.getInstance();
        BreakSingleton.instance = null; // Directly accessing the static variable to break the singleton.
        BreakSingleton s2 = BreakSingleton.getInstance();
        System.out.println(s1 == s2); 
      }
}
//---> instance variable ko public krne se hum usko class ke through access krke dubara se null kr diye 
   //jiski vjh se fir se method call pr nya object bn gya aur singleton break ho gya....>