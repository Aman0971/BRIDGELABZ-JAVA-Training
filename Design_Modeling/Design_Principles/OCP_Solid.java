package Design_Principles;

// follow OCP.

interface PaymentMethod{
    void payment();
}
class UPIPayment implements PaymentMethod{
    public void payment(){
        System.out.println("UPI Payment");
    }
}
class CardPayment implements PaymentMethod{
    public void payment(){
        System.out.println("Card Payment");
    }
}
public class OCP_Solid {
   //--> Violates Open-Closed Principle.-->

    // public void processUPIPayment() {
    //     System.out.println("UPI Payment");
    // }

    // public void processCardPayment() {
    //     System.out.println("Card Payment");
    // }

    public static void main(String[] args) {

        PaymentMethod p = new UPIPayment();
        p.payment();
        PaymentMethod q = new CardPayment();
        q.payment();

        // p.processUPIPayment();
        // p.processCardPayment();
    }
}

