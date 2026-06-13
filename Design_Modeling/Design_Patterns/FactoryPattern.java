package Design_Patterns;

interface Vehicle {
    void drive();
}

class Car implements Vehicle {
    public void drive() {
        System.out.println("Car is driving by Aman.");
    }
}

class Bike implements Vehicle {
    public void drive() {
        System.out.println("Bike is driving by Aman.");
    }
}

/*
 * ab hum factory class banayenge jo object create kregi.
 * ye object creation user directly nhi krta ,
 * vo bas factory method se object mangta hai. kis class ka object bnega use ye
 * bhi nhi pta hota
 */
class VehicleFactory {
    public static Vehicle getVehicle(String value) {
        if(value.equalsIgnoreCase("car")) {
            return new Car();
        } else if (value.equalsIgnoreCase("bike")) {
            return new Bike();
        } else {
            return null;
        }
    }
}

public class FactoryPattern {
    public static void main(String[] args) {
        Vehicle v1 = VehicleFactory.getVehicle("Car");
        v1.drive();

        Vehicle v2 = VehicleFactory.getVehicle("Bike");
        v2.drive();

        Vehicle v3 = VehicleFactory.getVehicle("Bus");
        if (v3 != null) {
            v3.drive();
        } else {
            System.out.println("Invalid vehicle type");
        }
    }
}