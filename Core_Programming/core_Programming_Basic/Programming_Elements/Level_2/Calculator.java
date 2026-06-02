import java.util.*;
public class Calculator{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float n1 = sc.nextFloat();
		float n2 = sc.nextFloat();
		
		float add = n1 + n2;
		float sub = Math.abs(n1-n2);
		float mul = n1 * n2;
		float div = 0;
		if(n2 != 0) {
			div = n1 / n2; 
		}
		else {
			System.out.println("division not possible");
			
		}
		System.out.print("The addition, subtraction, multiplication and division value of 2 numbers "
                + n1 + " and " + n2 + " is "
                + add + ", " + sub + ", " + mul + ", and " + div);
	}
}