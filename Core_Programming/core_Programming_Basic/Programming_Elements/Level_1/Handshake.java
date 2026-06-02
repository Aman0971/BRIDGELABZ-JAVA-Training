import java.util.*;
public class Handshake{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int handshakes = (n*(n-1))/2;
		System.out.print("total number of handshakes are: "+handshakes);
	}
}