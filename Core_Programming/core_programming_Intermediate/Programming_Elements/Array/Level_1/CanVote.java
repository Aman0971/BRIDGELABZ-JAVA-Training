import java.util.*;
public class CanVote{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]>0 && arr[i]<18) {
				System.out.println("Student with the age "+arr[i]+ " can not vote");
			}
			else if(arr[i] >= 18) {
				System.out.println("Student with the age "+arr[i]+ " can vote");
			}
			else {
				
					System.out.println("Invalid age");
			}
			
		}
		
	}
}