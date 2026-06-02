import java.util.*;
public class SpringSeason{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int date = sc.nextInt();
		int month = sc.nextInt();
		if(date<=20 && month>=3 && month<=6) {
			System.out.print("It's a spring season");
		}
		else {
			System.out.print("Not a spring season");
		}
	}
}