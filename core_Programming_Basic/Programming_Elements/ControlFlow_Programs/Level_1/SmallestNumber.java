import java.util.*;
public class SmallestNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		boolean isSmallest = (a<b) && (a<c);
		System.out.print(" Is the first number the smallest: "+ isSmallest);
	}
}