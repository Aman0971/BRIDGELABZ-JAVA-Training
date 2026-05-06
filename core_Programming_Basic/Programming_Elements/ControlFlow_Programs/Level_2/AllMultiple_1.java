import java.util.*;
public class AllMultiple_1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n>0 && n<100) {
			int counter = 100;
			System.out.println("Multiples of " + n + " below 100 are:");
			while(counter>=1) {
				if(counter % n == 0) {
					System.out.println(counter);
				}
				counter--;
			}
		}
		else {
			System.out.println("Enter number in rage of 1 to 100");
		}
	}
}