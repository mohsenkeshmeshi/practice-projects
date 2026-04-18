package t49;

import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		
		List<String> oldMessages = new ArrayList<>();
		oldMessages.add("سلام");
		oldMessages.add("پیام قدیمی 1");
		oldMessages.add("پیام قدیمی 2");
		
		List<String> newMessages = new ArrayList<>();
		newMessages.add("سلام");
		newMessages.add("پیام جدید 1");
		newMessages.add("پیام جدید 2");
		
		Utility.copy(newMessages, oldMessages);
		
		System.out.println(newMessages);
	}

}
