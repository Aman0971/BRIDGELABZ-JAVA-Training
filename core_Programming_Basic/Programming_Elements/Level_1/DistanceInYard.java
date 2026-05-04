import java.util.*;
public class DistanceInYard{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double feet = sc.nextInt();
		double yard = feet/3;
		double miles = yard/1760;
		System.out.println("Distance in yards is " + yard +
                " and in miles is " + miles);
	}
}