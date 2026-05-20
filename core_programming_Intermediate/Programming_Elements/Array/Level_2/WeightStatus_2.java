import java.util.*;
public class WeightStatus{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		double[][] personData = new double[number][3];
		String[] weightStatus = new String[number];
		
		
		double weight[] = new double[n];
		double height[] = new double[n];
		String[] status = new String[n];
		double bmi[] = new double[n];
		
		for(int i = 0; i<n; i++){
			weight[i] = sc.nextDouble();
			height[i] = sc.nextDouble();
		}
		
		for(int i=0; i<n; i++) {
			bmi[i] =  weight[i]/(height[i]*height[i]);
			
			if(bmi[i]<= 18.4) {
				status[i] ="Underweight";
			}
			else if (bmi[i] >= 18.5 && bmi[i] <= 24.9) {
                status[i] = "Normal";
            }
            else if (bmi[i] >= 25.0 && bmi[i] <= 39.9) {
                status[i] = "Overweight";
            }
            else {
                status[i] = "Obese";
            }
		}
		for(int i =0; i<n; i++) {
			System.out.println("Weigth: "+ weight[i] + " kg");
			System.out.println("height: "+height[i]);
			System.out.println("bmi : "+bmi[i]);
			System.out.println("status : "+status[i]);
		}
		
	}
}