package t30;

public class Utility {

	public static String toUpper(String s) {
		return s.toUpperCase();
	}

	public static String reverse(String s) {
		return new StringBuilder(s).reverse().toString();
	}
	
	public static String removeSpace(String s) {
		return s.replace(" ", "");
	}
}
