import java.util.*;
public class Divisible_1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =  sc.nextInt();
		if(n>0) {
			int i = 1;
			while(i<=n) {
				if(n%i==0) {
					System.out.println("Number is divisible by i: "+i);
				}
				i++;
			}
		}
		else {
			System.out.print("Number is invalid");
		}
	}
}