package t23;

public interface Payable {
	
	default double calculateFinalAmount(double amount, double discountRate, double taxRate) {
		
		double discount = amount * discountRate;
		double afterDiscount = amount - discount;
		double tax = afterDiscount * taxRate;
		
		return afterDiscount + tax;
		
	}

}
