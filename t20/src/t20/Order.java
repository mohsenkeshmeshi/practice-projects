package t20;

public class Order {
	
	private OrderStatus status = OrderStatus.PENDING;
	
	public OrderStatus getStatus() {
		return status;
	}
	
	public void advance() {
		status = status.nextStatus();
	}


}
