package t5;

import java.util.Scanner;
public class CafeOrder {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("نام مشتری را وارد کنید :");
		String customerName = in.nextLine();
		
		System.out.println("تعداد قهوه را وارد کنید :");
		int count = in.nextInt();
		
		System.out.println("قیمت هر قهوه :");
		double price = in.nextDouble();
		
		double finalPrice = price * count;
		
		System.out.printf("%,.2f مبلغ محاسبه شده : تومان",finalPrice);
	}
}
