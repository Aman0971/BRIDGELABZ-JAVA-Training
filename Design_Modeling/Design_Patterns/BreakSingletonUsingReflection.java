package Design_Patterns;

import java.lang.reflect.Constructor;

class BreakSingletonReflection{
    private static BreakSingletonReflection instance;
    
    private BreakSingletonReflection(){
        System.out.println("BreakSingletonReflection instance created");
        /*  if we want to prevent breaking with reflection then we can add this code in constructor.
        if(instance != null) {
          throw new RuntimeException("Singleton already created");
        }
        */
    }

    public static BreakSingletonReflection getInstance(){
        if(instance == null){
            instance = new BreakSingletonReflection();
        }
        return instance;
    }
}
public class BreakSingletonUsingReflection {
     public static void main(String[] args) throws Exception{
        BreakSingletonReflection s1 = BreakSingletonReflection.getInstance();

        Constructor<BreakSingletonReflection> cons = BreakSingletonReflection.class.getDeclaredConstructor();
        cons.setAccessible(true);

        BreakSingletonReflection s2 = cons.newInstance();
        System.out.println(s1 == s2);
     }
}
/* isme humara sigleton ka code shi hai pr hum reflection ka use krke singleton ko break kr rhe hai.
 1. sbse pahle ek object create kr dete hai aur reference intance me strore ho jata hai ,
 2. ab BreakSingletonReflection.class Ye Java ko bolta hai: Mujhe BreakSingletonReflection class ki metadata information do. 
 3. .getDeclaredConstructor() ...Java BreakSingletonReflection  class ke andar constructor search karta hai.
    aur use milta hai  private BreakSingletonReflection(). Ab Java constructor ko ek object ki form me return karta hai.
    cons ----> private Singleton()
    Dhyan rahe: Abhi constructor call nahi hua hai. Sirf uska reference mila hai. 
 4. ab constructor priavte hai to java allow nhi krega to isliye --
        cons.setAccessible(true); ye line java ko bolti hai:Access modifiers ignore karo.
 5. .newInstance();  Ye Reflection API ka method hai, java internally constructor execute karta hai aur object bna deta hai.
     cons.newInstance() --> ke andar Java us constructor ko execute karta hai jiska reference cons object ke paas hai.*/
  
