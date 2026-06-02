import java.util.*;
public class Factorial{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int sum1 = 1;
		if(n <= 0) {
			System.out.print("Number is not Positive Integer.");
		}
		else {
			int temp = n;
			while(temp>0) {
				sum1  *= temp;
				temp--;
			}
		System.out.print(sum1);
		}
	}
}