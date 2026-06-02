package Java_Collections_Streams;
import java.io.*;
public class BufferInputOutput {
    public static void main(String[] args) throws IOException {
        FileOutputStream fout = new FileOutputStream("file.txt");
        BufferedOutputStream bout = new BufferedOutputStream(fout);

        String data = "Buffered Stream Example";
        byte arr[] = data.getBytes();

        bout.write(arr);

        bout.flush(); // buffer forcefully file me bhejta hai
        bout.close();

        // BufferedInputStream
        FileInputStream fin = new FileInputStream("file.txt");
        BufferedInputStream bin = new BufferedInputStream(fin);

        int i;
        while((i = bin.read()) != -1){
            System.out.print((char)i);
        }

        bin.close();
    }
}
