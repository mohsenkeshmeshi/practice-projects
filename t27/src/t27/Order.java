package t27;

public class Order {

	private int id;
	private double amount;
	
	public Order(int id, double amount) {
		this.id = id;
		this.amount = amount;
	}
	
	public int getId() {
		return id;
	}
	
	public double getAmount() {
		return amount;
	}
	@Override
	public String toString() {
		return "Order {Id : "+ id+ "	Amount : "+ amount+ "}";
	}
}
