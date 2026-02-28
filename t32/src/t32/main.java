package t32;

import java.time.LocalDate;

public class main {

	public static void main(String[] args) throws Exception {
		
		Order o1 = new Order("PS5", 100000000, LocalDate.of(2026, 2, 3));
		Order o2 = new Order("Xbox", 0, null);
		
		OrderValidator ov = new OrderValidator(o2);
		boolean isValid = ov.createValidator();
	
//		var method = isValid.getClass().getMethod("isValid", Order.class);
		
		if(isValid) {
			System.out.println(o2.getName() + o2.getAmount() + o2.getDate());
		}
		else {
			System.out.println("خطا : سفارش مشکل دارد");
		}
//		System.out.println(method.invoke(isValid, o1) + o1.getName());
//		System.out.println(method.invoke(isValid, o2) + o2.getName());

	}

}
