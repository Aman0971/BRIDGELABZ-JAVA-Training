import java.util.*;
public class TraingleArea{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double base = sc.nextDouble();
		double height = sc.nextDouble();
		double area =  (base*height)/2;
		double areaInch = area/2.54;
		System.out.print("The Area of the triangle in sq in is "+areaInch+" and sq cm is "+area);
	}
}