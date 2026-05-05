import java.util.*;
public class SumUntil_1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double result = 0;
		
		while(true) {
			System.out.print("Enter the value: ");
			double n = sc.nextDouble();
			if(n <= 0) {
				break;
			}
			 result += n;
		}
		System.out.print(result);
	}
}