package Java_Collections_Streams;
import java.io.*;
class Student implements Serializable{
    int id ;
    String name;
    Student(int id, String name){
        this.id = id;
        this.name = name;
    }
}
public class ObjectInputOutput {
   public static void main(String[] args) throws IOException ,ClassNotFoundException {
    Student s = new Student(1, "Aman");
     
    FileOutputStream fout = new FileOutputStream("student.txt");
    ObjectOutputStream oos = new ObjectOutputStream(fout);
    oos.writeObject(s);
    oos.close();

    FileInputStream fin = new FileInputStream("student.txt");
    ObjectInputStream ois = new ObjectInputStream(fin);
    Student s1 = (Student) ois.readObject();
    System.out.println("ID: " + s1.id + ", Name: " + s1.name);
    ois.close();
   }
}
