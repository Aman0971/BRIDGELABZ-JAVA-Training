import java.util.*;
public class BubbleSort{
	public static void bubbleSort(int arr[]) {
		int n = arr.length;
	for(int i=0; i<arr.length; i++) {
		boolean temp = false;
		
		for(int j=0; j<n-i-1; j++) {
			if(arr[j] > arr[j+1]) {
				int past = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = past;
				temp = true;
			}
		 }
		if(temp == false) {
			break;
		}
	 }
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i =0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		bubbleSort(arr);
	 System.out.print("Sorted array is: ");
	 for(int i=0; i<arr.length; i++) {
		System.out.print(arr[i]+" ");
	 }
	}
}