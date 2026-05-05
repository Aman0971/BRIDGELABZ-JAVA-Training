import java.util.*;
public class LargestNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a>b && a>c) {
			System.out.println(" Is the first number the Largest: true");
			System.out.println(" Is the second number the Largest: false");
			System.out.println(" Is the third number the Largest: false");
		}
//		boolean isSmallest = (a<b) && (a<c);
//		System.out.print(" Is the first number the smallest? "+ isSmallest);
		else if(b>a && b>c) {
			System.out.println(" Is the second number the Largest: true");
			System.out.println(" Is the frist number the Largest: false");
			System.out.println(" Is the third number the Largest: false");
		}
		else if(c>a && c>b) {
			System.out.println(" Is the third number the Largest: true");
			System.out.println(" Is the frist number the Largest: false");
			System.out.println(" Is the second number the Largest: false");
		}
		else {
			System.out.print("All numbers are equal");
		}
	}
}