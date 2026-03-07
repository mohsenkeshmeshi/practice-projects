package t27;

import java.util.ArrayList;
import java.util.function.Consumer;

public class main {

	public static void main(String[] args) {
		
		ArrayList<Order> orders = new ArrayList<>();
		
		orders.add(new Order(1, 2000000));
		orders.add(new Order(2, 320000));
		orders.add(new Order(3, 1250000));
		orders.add(new Order(4, 795000));
		
		Consumer<Order> chekVip = order -> {
			if(order.getAmount() > 1000000) {
				System.out.println(order+ "VIP Order");
			}
			else {
				System.out.println(order+ "Normal Order");
			}
		};
		
		orders.forEach(chekVip);

	}

}
