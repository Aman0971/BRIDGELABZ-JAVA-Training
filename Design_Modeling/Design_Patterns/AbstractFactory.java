package Design_Patterns;
// Product 1: Chairs
interface Chair {
    void sitOn();
}
class ModernChair implements Chair {
    public void sitOn() { System.out.println("Sitting on a sleek modern chair."); }
}

class VictorianChair implements Chair {
    public void sitOn() { System.out.println("Sitting on an ornate Victorian chair."); }
}

// Product 2: Sofas
interface Sofa {
    void lieOn();
}
class ModernSofa implements Sofa {
    public void lieOn() { System.out.println("Lying on a minimalist modern sofa."); }
}

class VictorianSofa implements Sofa {
    public void lieOn() { System.out.println("Lying on a plush Victorian sofa."); }
}

interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
}

// Factory for Modern Furniture
class ModernFurnitureFactory implements FurnitureFactory {
    public Chair createChair() { return new ModernChair(); }
    public Sofa createSofa() { return new ModernSofa(); }
}

// Factory for Victorian Furniture
class VictorianFurnitureFactory implements FurnitureFactory {
    public Chair createChair() { return new VictorianChair(); }
    public Sofa createSofa() { return new VictorianSofa(); }
}

public class AbstractFactory {
     public static void main(String[] args) {
        // The application decides which factory to use based on configuration
        FurnitureFactory factory = new ModernFurnitureFactory();

        // The client code automatically gets matching items
        Chair chair = factory.createChair();
        Sofa sofa = factory.createSofa();

        chair.sitOn(); // Outputs: Sitting on a sleek modern chair.
        sofa.lieOn();  // Outputs: Lying on a minimalist modern sofa.
    }
}
