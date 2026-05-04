import java.util.*;
public class RemainderAndQuotient{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a =  sc.nextInt();
		int b =  sc.nextInt();
		float quotient = (float)(a/b);
		int remainder = a%b;
		System.out.print("The Quotient is "+quotient+" and Reminder is "+remainder+" of two number "+a+" and "+b);
	}
}