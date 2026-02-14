package t12;

import java.util.ArrayList;
import java.time.LocalDate;
public class main {

	public static void main(String[] args) {
		ArrayList<Order> orders = new ArrayList<>();
		
		orders.add(new Order(1,1000,LocalDate.of(2026, 1, 25)));
		orders.add(new Order(2,2500,LocalDate.of(2026, 2, 14)));
		orders.add(new Order(3,3200,LocalDate.of(2026, 5, 17)));
		
		double total = 0;
		for(Order o : orders) {
			total += o.amount();
		}
		
		System.out.printf("%,.2fجمع کل = ", total);

	}

}
