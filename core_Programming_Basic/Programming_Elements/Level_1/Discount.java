public class Discount{
	public static void main(String[] args) {
		int fee = 125000;
		int discountPercentage = 10;
		int discount =  (fee * discountPercentage)/100;
		int payFee =  fee-discount;
		System.out.print(" The discount amount is INR "+discount +" and final discounted fee is INR "+ payFee);
	}
}