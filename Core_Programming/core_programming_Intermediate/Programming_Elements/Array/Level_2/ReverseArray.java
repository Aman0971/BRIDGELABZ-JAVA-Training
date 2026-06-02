import java.util.*;
public class ReverseArray{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n ;
		int count = 0;
		while(temp>0) {
			count++;
			temp = temp / 10; 
		}
		int arr[] = new int[count];
		for(int i = arr.length-1; i>=0; i--) {
			int digit = n % 10;
			arr[i] = digit;
			n = n / 10;
		}
		int arr1[] = new int[arr.length];
		int j =0;
		for(int i = arr.length-1; i>= 0; i--) {
			arr1[j++] = arr[i]; 
		}
		for(int i =0; i<arr1.length; i++) {
			System.out.print(arr1[i]);
		}
	}
}