import java.util.*;
public class MaxDigit{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =  sc.nextInt();
		int arr[] = new int[10];
		int index = 0;
		while(n!=0) {
			int digit = n % 10;
			if(index < 10) {
				arr[index] = digit;
				index++;
			}
			else {
			  break;
			}
			n  = n / 10;
		}
		int largest = 0;
		int secondLargest =0;
		for(int i =0; i<index; i++) {
			if(arr[i]>largest) {
				largest = arr[i];
			}
		}
		for(int i =0; i<index; i++) {
			if(arr[i]>secondLargest && arr[i] != largest) {
				secondLargest = arr[i];
			}
		}
		System.out.println("Largest number in array is: "+largest);
		System.out.println("Second Largest number in array is: "+secondLargest);
		
	}
}