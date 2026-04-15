package t46;

public class Order {

	private String product;
	private int price;
	
	public Order(String product, int price) {
		this.product = product;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Order{Product: "+product+" ||| Price: "+price+"}";
	}
}
