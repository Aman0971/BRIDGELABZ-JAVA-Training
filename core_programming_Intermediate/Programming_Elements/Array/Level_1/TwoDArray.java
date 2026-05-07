import java.util.*;
public class TwoDArray{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int m = sc.nextInt();
		int n =  sc.nextInt();
		
		int arr[][] = new int[m][n];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int k=0;
		int arr1[] = new int[m*n];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr1[k++] = arr[i][j];
			}
		}
		for(int x=0; x<arr1.length; x++) {
			System.out.println("Values are : "+arr1[x]);
		}
	}
}