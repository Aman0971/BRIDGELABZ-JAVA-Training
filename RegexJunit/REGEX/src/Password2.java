import java.util.regex.*;
import java.util.*;

public class Password2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your password: " );
        String s  = sc.nextLine();
        Pattern p = Pattern.compile("[@$#*%](?=.*[a-z])[a-zA-Z]{4,7}[_]\\d{3,5}");
        Matcher m =  p.matcher(s);
        boolean b = m.matches();
        if(b){
            System.out.println("Your password is : Valid" );
        }else{
            System.out.println("Chiiiiii Yrrr" );
        }

    }
}
