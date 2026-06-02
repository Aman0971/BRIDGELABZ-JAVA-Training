import java.util.*;
public class KilometerToMiles{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double km = sc.nextDouble();
		double miles = km * 1.6;	
		System.out.print("The total miles is "+miles+ " for the given "+km+" km");
	}
}