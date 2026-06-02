import java.util.*;
public class SumOfNaturalNum{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum = 0;
		if(a>0) {
			sum = (a*(a+1))/2;
			System.out.print("The sum of "+a+" natural numbers is "+sum);
		}
		else {
		System.out.print("The number "+a+" is not a natural number");
		}
	}
}