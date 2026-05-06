import java.util.*;
public class Power{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int power =  sc.nextInt();
		
		int result = 1;
		int count = 0;
		while(count<power) {
			result = result * power;
			count++;
		}
		System.out.print("The number "+number+" is after applying power "+power+" on it is : "+result);
	}
}