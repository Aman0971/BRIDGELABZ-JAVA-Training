package Java_Collections_Streams;
import java.io.IOException;
public class InputByRead {
public static void main(String[] args) throws IOException {
    System.out.println("Enter a character : ");
    int data  = System.in.read();
    System.out.println("Data is : " + (char)data);
    System.out.println((int)data);
}
}
// isme read() kelval ek hi letter ko print krega aur uske baare me batayega ki uska ascii code kya hai.