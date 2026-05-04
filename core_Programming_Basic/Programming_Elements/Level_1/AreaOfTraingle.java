import java.util.*;
public class AreaOfTraingle{
	public static void main(String[] args){
		Scanner sc =  new Scanner(System.in);
		int base = sc.nextInt();
		int height = sc.nextInt();
		double area = (base*height)/2;
		double inch = area/2.54;
		double feet = inch/12;
		System.out.print(" Your Area in cm is "+area+"  while in feet is "+feet+" and inches is "+inch);
	}
}