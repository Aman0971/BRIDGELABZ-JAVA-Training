import java.util.*;
public class Table{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
	    int number =  sc.nextInt();
		
		int k= 0;
		for(int i=1; i<=10; i++) {
			arr[k++] = number * i;
		}
		int j = 1;
		for(int i=0; i<arr.length; i++) {
			System.out.println(number+ " * "+j+ " = "+arr[i]);
			j++;
		}
	}
}