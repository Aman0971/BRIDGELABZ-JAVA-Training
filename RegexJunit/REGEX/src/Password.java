import java.util.*;

public class Password {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s  = sc.next();
        if(s.matches("[A-z][a-z]+.[0-9]+")){
            System.out.print("Strong password");
        }
        else{
            System.out.print("weak password");
        }
    }
}
