package t12;

import java.time.LocalDate;
public record Order(int oederId, double amount, LocalDate date) {
	
	public Order{
		if(amount < 0) {
			throw new IllegalArgumentException("مبلغ سفارش نمی تواند منفی باشد");
		}
	}
}
