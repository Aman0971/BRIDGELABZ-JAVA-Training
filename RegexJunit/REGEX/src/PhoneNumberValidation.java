import java.util.*;
public class PhoneNumberValidation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(s.matches("^[6-9][0-9]{9}$")){
            System.out.print("Phone Number is valid");
        }
        else{
            System.out.print("Phone Number is not valid");
        }
    }
}
