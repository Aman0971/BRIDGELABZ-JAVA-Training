package Java_Collections_Streams;
import java.io.IOException;
public class WithoutThrows {
    
    public static void main(String[] args) {

        try {
            int data = System.in.read();
            System.out.println("Data is : " + data);
            System.out.println((char)data);


        } catch (IOException e) {
            System.err.println("Error occurred");
        }
    }
}
// yha mai exception ko handle krne ke liye try catch ka use kiyahu , method me throws ka nhi.