import java.util.*;
public class Table_1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
	    int number =  sc.nextInt();
		
		int k= 0;
		if(number>=6 && number<=9) {
		for(int i=1; i<=10; i++) {
			arr[k++] = number * i;
		}
		
		int j = 1;
		for(int i=0; i<arr.length; i++) {
			System.out.println(number+ " * "+j+ " = "+arr[i]);
			j++;
		}
		}
		else {
			System.out.print("Enter valid number");
		}
	}
}