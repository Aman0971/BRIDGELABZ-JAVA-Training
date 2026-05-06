import java.util.*;
public class Bonus{
	public static void  main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int salary = sc.nextInt();
		float year = sc.nextFloat();
		int bonus = 0;
		
		if(year > 5.0) {
			bonus = (salary*5)/100;
		}
		System.out.print(bonus);
	}
}