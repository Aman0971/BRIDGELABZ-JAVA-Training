import java.util.*;
public class BinarySearch{
	public static int binarySearch(int arr[], int target , int low, int high) {
		while(low<high) {
			int mid = low +(high - low)/2;
			if(arr[mid] == target) {
				return mid;
			}
			else if(arr[mid]<target) {
				low = mid +1;
			}
			else {
				high = mid-1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,7,8};
		int n  = arr.length;
		int target = 2;
		int low =0;
		int high = n;
		int res = binarySearch(arr,  target ,  low,  high);
		System.out.print(res);
	}
}