package com.company.ecommerce.model;

import java.time.LocalDate;

import com.company.ecommerce.model.*;

public class main {

	public static void main(String[] args) {
		Customer c = new Customer("Taha Ahadi");
		Order o = new Order(1,2000,LocalDate.of(2026, 4, 17));
		
		String message = """
				شماره سفارش : %s,
				مبلغ : %s,
				تاریخ سفارش : %s,
				نام مشتری : %s
				""".formatted(o.getId(),o.getamount(),o.getDate(),c.getName());
		System.out.println(message);

	}

}
