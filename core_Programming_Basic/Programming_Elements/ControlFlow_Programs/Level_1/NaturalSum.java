import java.util.*;
public class NaturalSum{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int sum1 = 0;
		int sum2 = 0;
		if(n<= 0) {
			System.out.print("Number is not Positive Integer");
		}
		else {
			 sum1 += (n *(n+1))/2;
			while(n>0) {
				sum2  += n;
				n--;
			}
		
		if(sum1 == sum2) {
			System.out.println("Both sum are equal:");
			System.out.println("frist result is : "+sum1);
			System.out.println("Second result is : "+sum2);
			
		}
		else {
			System.out.print("Both are not equal");
		}
		}
	}
}