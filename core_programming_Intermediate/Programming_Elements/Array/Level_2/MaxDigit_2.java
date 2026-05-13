import java.util.*;
public class MaxDigit_2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =  sc.nextInt();
		int max = 10;
		int arr[] = new int[max];
		int index = 0;
		while(n!=0) {
			int digit = n % 10;
			if(index == max) {
				max = max +10;
				
				int[] temp = new int[max];
				for(int i = 0; i<arr.length; i++) {
					temp[i] = arr[i];
				}
				arr = temp;
			}
			arr[index] = digit;
			index++;
			n  = n / 10;
		}
		System.out.print("Elements in array are: ");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
		int largest = 0;
		int secondLargest =0;
		for(int i =0; i<index; i++) {
			if(arr[i]>largest) {
				largest = arr[i];
			}
		}
		for(int i = 0; i<index; i++) {
			if(arr[i]>secondLargest && arr[i] != largest) {
				secondLargest = arr[i];
			}
		}
		System.out.println("Largest number in array is: "+largest);
		System.out.println("Second Largest number in array is: "+secondLargest);
		
	}
}