package Java_Collections_Streams;
import java.io.*;
public class DataInputOutput {
  public static void main(String[] args) throws IOException {
    // File me data write karna
        FileOutputStream fout =
            new FileOutputStream("data.txt");

        DataOutputStream dout =
            new DataOutputStream(fout);

        dout.writeInt(100);
        dout.writeDouble(99.5);
        dout.writeBoolean(true);

        dout.close();

        // File se data read karna
        FileInputStream fin =
            new FileInputStream("data.txt");

        DataInputStream din =
            new DataInputStream(fin);

        int a = din.readInt();
        double b = din.readDouble();
        boolean c = din.readBoolean();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        din.close();
  }  
}
