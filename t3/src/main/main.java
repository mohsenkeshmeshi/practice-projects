package main;

import java.lang.System;
import java.math.*;
import java.util.Scanner;

public class main {
	
	enum Customer_Type{NORMAL,VIP,EMPLOYEE};
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("قیمت کالا را وارد کنید : ");
		
		double price = in.nextDouble();
		
		Customer_Type Type = Customer_Type.VIP;
		
		double discountRate = switch(Type) {
		case NORMAL -> 0.0;
		case VIP -> 0.15;
		case EMPLOYEE -> 0.25;
		};
		double profit = Math.pow(price,0.25);
		price = price + (price * profit / 100);
		double discountAmount = price * discountRate;
		double finalPrice = price - discountAmount;
		
		System.out.println("سود : %"+profit);
		System.out.println("مبلغ نهایی با احتساب سود و تخفیف : "+finalPrice);
		
		
	}
	

}
