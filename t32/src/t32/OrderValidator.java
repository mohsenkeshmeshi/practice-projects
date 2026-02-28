package t32;

import java.time.LocalDate;

public class OrderValidator {
	
	private Order orders;
	
	public OrderValidator(Order orders) {
		this.orders = orders;
	}

	public boolean createValidator() {
		
		class Validator {
			public boolean isValid(Order o) {
				if(o.getAmount() <= 0.0) {
					return false;
				}
				else if(o.getDate() == null || o.getDate().isAfter(LocalDate.now())) {
					return false;
				}
				else {
					return true;
				}
			}
		}
		Validator v = new Validator();
		boolean valid = v.isValid(orders);
		return valid;
	}

}
