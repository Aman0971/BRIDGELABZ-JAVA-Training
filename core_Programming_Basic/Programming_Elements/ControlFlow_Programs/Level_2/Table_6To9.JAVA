import java.util.*;
public class Table_6To9{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if(number>=6 && number<=9) {
			for(int i=1; i<=10; i++) {
				int a  = number *i;
				System.out.println(number+ "*" +i+" : " +a);
			}
		}
		else {
			System.out.print("Enter the valid number.");
		}
	}
}