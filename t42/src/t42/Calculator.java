package t42;

public class Calculator {

	public double divide(double a, double b) {
		assert b != 0 : "عدد مخرج نمیتواند برابر 0 باشد";
		return a / b;
	}
}
