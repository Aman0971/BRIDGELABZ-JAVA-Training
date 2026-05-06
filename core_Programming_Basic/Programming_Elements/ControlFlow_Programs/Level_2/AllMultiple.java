import java.util.*;
public class AllMultiple{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n>0 && n<100) {
			System.out.println("Multiples of " + n + " below 100 are:");
			for(int i=100; i>=1; i--) {
				if(i % n == 0) {
					System.out.println(i);
				}
			}
		}
		else {
			System.out.println("Enter number in rage of 1 to 100");
		}
	}
}