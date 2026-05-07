import java.util.*;
public class NumberCheck{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		int n =  arr.length;
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<0) {
				System.out.println(arr[i]+" is a Negative number.");
			}
			if(arr[i]==0) {
				System.out.println(arr[i]+" is Zero");
			}
			if(arr[i]>0) {
				if(arr[i]%2==0) {
					System.out.println(arr[i]+" is a Positive and Even number.");
				}
				else {
					System.out.println(arr[i]+" is a Positive and Odd number.");
				}
			}
		}
		if(arr[0] == arr[n-1]) {
			System.out.println("Frist and last element of Array is: Equal");
		}
		else if(arr[0]>arr[n-1]) {
			System.out.println("Frist element "+arr[0]+" is greater than last element of Array.");
		}
		else {
			System.out.println("Last element "+arr[n-1]+" is greater than frist  element of Array.");
		}
	}
	
}