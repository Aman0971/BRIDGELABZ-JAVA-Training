import java.util.*;
public class FootballPlayer{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double arr[] = new double[11];
		int n =  arr.length;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextDouble();
		}
		
		double sum =0.0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		System.out.print("Mean height of the football team is: "+sum/n);
	}
}