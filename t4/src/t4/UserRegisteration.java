package t4;

import java.util.*;
public class UserRegisteration {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("نام کامل خود را وارد کنید :");
		String fullName = in.nextLine().trim();
		
		if(fullName.length() == 0) {
			System.out.print("خطا  نام کامل نمیتواند خالی باشد");
			return;
		}
		int spaceIndex = fullName.indexOf(" ");
		String firstName = fullName.substring(0,spaceIndex);
		String lastName = fullName.substring(spaceIndex + 1);
		
		firstName = capitalize(firstName);
		lastName = capitalize(lastName);

		String message = """
				FirstName is %s,
				LastName is %s
				""".formatted(firstName,lastName);
		System.out.println(message);
	}
	
	private static String capitalize(String text) {
		StringBuilder sb = new StringBuilder(text.toLowerCase());
		sb.setCharAt(0,Character.toUpperCase(sb.charAt(0)));
		return sb.toString();
	}
}
