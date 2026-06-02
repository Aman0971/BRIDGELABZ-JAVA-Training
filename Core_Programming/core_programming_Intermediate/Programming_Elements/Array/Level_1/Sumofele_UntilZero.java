import java.util.*;
public class Sumofele_UntilZero{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double arr[] = new double[10];
		double result =  0.0;
		int i = 0;
		while(true) {
			double n =  sc.nextDouble();
			if(n<=0) {
				break;
			}
			if(i==10) {
				break;
			}
			arr[i] = n;
			i++;
		}
		for(int j=0; j<i; j++) {
			System.out.println(arr[j]);
			result += arr[j];
		}
		System.out.println("Total sum: "+result);
	}
}
		
		