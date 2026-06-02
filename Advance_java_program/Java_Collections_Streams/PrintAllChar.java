package Java_Collections_Streams;
import java.io.IOException;
public class PrintAllChar {
public static void main(String[] args) throws IOException {
    System.out.println("Enter a character : ");
    byte[] arr = new byte[100];
    int size = System.in.read(arr);
    for(int i =0; i<size-2; i++){
      char ch =  (char)arr[i];
      System.out.println(ch +"--->"+(int)ch);
    }
  }
}
