package main;

import java.lang.System;
import java.util.Scanner;

public class main {
	public static final double TAX_RATE = 0.09;
	enum Department{IT,SALES,HR};
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("حقوق ناخالص را وارد کنید : ");
		var grossSalary = in.nextDouble();
		
		var tax = grossSalary * TAX_RATE;
		
		var netSalary = grossSalary - tax;
		
		System.out.print("Your Net Salary : ");
		System.out.printf("%,.2f", netSalary);
	}
}
