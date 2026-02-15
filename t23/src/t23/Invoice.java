package t23;

public class Invoice implements Payable,Discountable,Taxable{

	private double amount;
	
	public Invoice(double amount) {
		this.amount = amount;
	}
	
	@Override
	public double getDiscountRate() {
		return 0.10;
	}
	
	@Override
	public double getTaxRate() {
		return 0.09;
	}
	
	public double getFinalAmount() {
		return calculateFinalAmount(amount, getDiscountRate(), getTaxRate());
	}
	
	public double getAmount() {
		return amount;
	}

}
