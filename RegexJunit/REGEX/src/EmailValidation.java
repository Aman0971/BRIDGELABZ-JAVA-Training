import java.util.*;
import java.util.regex.Pattern;
public class EmailValidation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean temp = Pattern.matches("^[a-zA-Z0-9_.]+[0-9]{2,4}@gmail\\.com$",sc.nextLine());
        boolean temp2 = Pattern.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$",sc.nextLine());
        System.out.println(temp);
        System.out.print(temp2);
    }
}
