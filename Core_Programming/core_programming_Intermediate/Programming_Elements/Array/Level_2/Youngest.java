import java.util.*;
public class Youngest{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] age = new double[3];
		double[] height = new double[3];
		
		String[] name = {"Amar","Akbar","Anthony"};
		
		
		for(int i=0; i<age.length; i++) {
			age[i] = sc.nextDouble();
		}
		for(int i=0; i<height.length; i++) {
			height[i] = sc.nextDouble();
		}
		double small = Integer.MAX_VALUE;
		int k= 0;
		for(int i=0; i<age.length; i++) {
			if(age[i]<small) {
				small = age[i];
				k = i;
			}
		}
		System.out.println("The youngest friend is: "+name[k]);
		
		double len = 0;
		int c= 0;
		for(int i=0; i<height.length; i++) {
			if(height[i]>len) {
				len = height[i];
				c = i;
			}
		}
		System.out.print("The tallest freind is: "+name[c]);
		
	}
}