package Java_Collections_Streams;
import java.io.*;
public class ByteArrayInputOutput {
   public static void main(String[] args) throws IOException {
    ByteArrayOutputStream bout = new ByteArrayOutputStream();
    // String data = "hello aman , welcome.";
    // byte arr[] = data.getBytes();
    byte arr[] = {'h','e','y'};
    bout.write(arr);
    bout.close();

    ByteArrayInputStream bin = new ByteArrayInputStream(arr);
    int i;
    while((i=bin.read()) != -1){
        System.out.print((char)i);
    }
    bin.close();
   }
}
