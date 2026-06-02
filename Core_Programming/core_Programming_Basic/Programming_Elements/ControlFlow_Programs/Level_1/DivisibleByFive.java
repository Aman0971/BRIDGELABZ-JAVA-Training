import java.util.*;
public class DivisibleByFive{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		if(a%5==0) {
			System.out.print("Number is divisible by 5");
		}
		else {
			System.out.print("not divisible");
		}
	}
}