package t10;

public class MathUtil {
	public static double colculateTax(double gross) {
		return gross * 0.09;
	}
	
	public static String formatCurrency(double amount) {
		return String.format("%,.0f", amount);
	}
}
