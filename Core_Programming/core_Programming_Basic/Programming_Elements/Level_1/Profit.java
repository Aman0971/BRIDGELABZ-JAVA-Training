public class Profit{
	public static void main(String[] args) {
		int costPrice = 129;
		int sellPrice = 191;
		int profit = sellPrice - costPrice;
		int profit_percentage = (profit*100)/costPrice;
		System.out.println("The Cost Price is INR " + costPrice +
				" and Selling Price is INR "+ sellPrice +
				". The Profit is INR "+ profit + " and the Profit Percentage is "+ profit_percentage +"%");
	}
}