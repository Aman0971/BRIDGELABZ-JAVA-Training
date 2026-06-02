import java.util.*;
import java.io.*;
class ContactNotFoundException extends Exception{
    public ContactNotFoundException(String message){
        super(message);
    }
}
class Contact implements Serializable{
    int id;
    String name;
    

    Contact(int id, String name){
        this.id = id;
        this.name = name;
        
    }
    public String toString(){
        return "Id: " + id + "\nName: " + name;
    }
}
// USING Generics 
class AddressBook1<T extends Contact> {
    ArrayList<T> list =  new ArrayList<>();
    //add
    public void addContact(T contact){
        list.add(contact);
    }
    // delete
    void delete(int Id) throws ContactNotFoundException {

    boolean found = false;

    for(int i = 0; i < list.size(); i++) {
        if(list.get(i).Id == Id) {
            list.remove(i);
            found = true;
            break;
        }
    }
    if(!found) {
        throw new ContactNotFoundException("Contact Not Found");
    }
  }
  void save() throws IOException {

        FileOutputStream fileOut = new FileOutputStream("contacts.data");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);

        out.writeObject(list);
        out.close();
        System.out.println("Data Saved");
    }

    // Retrieve from File
    void load() throws IOException,ClassNotFoundException {

        FileInputStream fileIn = new FileInputStream("contacts.data");
        ObjectInputStream in = new ObjectInputStream(fileIn);

        Object obj = in.readObject(); //read data from file
        list = (ArrayList<T>) obj; // convert object in to arrayList
        in.close();

        System.out.println("Data Loaded");
    }

    void display() {
        System.out.println(list);
    }
}
public class AddressBook {

    public static void main(String[] args) {

        AddressBook1<Contact> book = new AddressBook1<>();

        try {

            // Create
            book.addContact(new Contact(1, "Aman"));
            book.addContact(new Contact(2, "Rahul"));

            System.out.println("Original Data:");
            book.display();

            // Store
            book.save();

            // Delete
            book.delete(2);

            System.out.println("\nAfter Delete:");
            book.display();

            // Retrieve
            book.load();

            System.out.println("\nAfter Loading:");
            book.display();

        }
        catch(ContactNotFoundException e) {
            System.out.println(e.getMessage());
        }
        catch(IOException e) {
            System.out.println("File Error");
        }
        catch(ClassNotFoundException e) {
            System.out.println("Class Not Found");
        }
    }
}

