import java.util.*;
public class EvenOddArray{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int number =  sc.nextInt();
		int evenArray[] = new int[number/2 + 1];
		int oddArray[] = new int[number/2 + 1];
	    
		
		int even = 0;
		int odd = 0;
		for(int i=1; i<=number; i++) {
			if(i%2==0) {
				evenArray[even++] = i;
			}
			else {
				oddArray[odd++] = i;
			}
		}
		System.out.println("Even elements are:");
		for(int i=0; i<even; i++) {
			System.out.print(evenArray[i]+" ");
		}
		System.out.println();
		System.out.println("Odd elements are: ");
		for(int j=0; j<odd; j++) {
			System.out.print(oddArray[j]+" ");
		}
		
	}
}