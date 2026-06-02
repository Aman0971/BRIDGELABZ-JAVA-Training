package Java_Collections_Streams;
import java.io.*;;
public class FileInputOutput {
     public static void main(String[] args) throws IOException {

        // FileOutputStream -> file me write
        FileOutputStream fout = new FileOutputStream("file.txt");

        String data = "Hello Aman";
        byte arr[] = data.getBytes();

        fout.write(arr);
        fout.close();

        // FileInputStream -> file se read
        FileInputStream fin = new FileInputStream("file.txt");

        int i;
        while((i = fin.read()) != -1){
            System.out.print((char)i);
        }

        fin.close();
    }
}
