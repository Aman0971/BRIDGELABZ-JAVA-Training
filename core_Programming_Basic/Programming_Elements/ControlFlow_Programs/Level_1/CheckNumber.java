import java.util.*;
public class CheckNumber{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		if(n>0) {
			System.out.print("Number is Positive");
		}
		else if(n<0) {
			System.out.print("Number is Negative");
		}
		else {
			System.out.print("Number is 0");
		}
	}
}