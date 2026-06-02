import java.util.*;
public class Factorial_1{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int sum1 = 1;
		if(n <= 0) {
			System.out.print("Number is not Positive Integer.");
		}
		else {
			int temp = n;
			for(int i=1; i<=temp; i++) {
				sum1  *= i;	
			}
		System.out.print(sum1);
		}
	}
}