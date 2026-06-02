public class LinearSearch{
	public static void main(String[] args) {
		int arr[] = {2,4,5,1,7,8,0,6};
		int target = 8;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] ==  target) {
				System.out.print("Element found at position: "+i);
				break;
			}
		}
	}
}