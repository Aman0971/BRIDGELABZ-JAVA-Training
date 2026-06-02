import java.util.*;
public class SumUntilZero{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double result = 0;
		System.out.print("Enter the value: ");
		double n = sc.nextDouble();
		
		while(n != 0) {
			result +=  n;
			System.out.print("Enter the value: ");
			n = sc.nextDouble();
		}
		System.out.print(result);
	}
}