package Design_Patterns;

interface Coffee{
    String makeCoffee();
    double price();
}
class PlainCoffee  implements  Coffee{
    public String makeCoffee(){
       return "Plain Coffee";
    }
    public double price(){
        return 5.0;
    }
}

abstract class CoffeeDecorator implements Coffee{
    protected Coffee c;
    public CoffeeDecorator(Coffee c){
        this.c = c;
    }
    public String makeCoffee(){
        return c.makeCoffee();
    }
    public double price(){
        return c.price();
    }
}
class MilkDecorator extends CoffeeDecorator{
    public MilkDecorator(Coffee c){
        super(c);
    }
    public String makeCoffee(){
        return super.makeCoffee() + " with Milk";
    }
    public double price(){
        return super.price() + 2.0;
    }
}
public class Structural_DecoratorPattern {
     public static void main(String[] args){
        Coffee c1 = new PlainCoffee();
        System.out.println(c1.makeCoffee() + " costs $: " + c1.price());
        Coffee c2 = new MilkDecorator(c1);
        System.out.println(c2.makeCoffee() + " costs $: " + c2.price());
     }
}
