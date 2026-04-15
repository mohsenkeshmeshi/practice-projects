package t47;

import java.time.LocalDate;

public class main {

	public static void main(String[] args) {
		
		Pair<String, Integer> user1 = new Pair<>("Taha", 29);
		Pair<String, Integer> user2 = new Pair<>("Nima", 46);
		
		Pair<Long, LocalDate> order1 = new Pair<>(123456789L, LocalDate.of(2026, 2, 15));
		Pair<Long, LocalDate> order2 = new Pair<>(987654321L, LocalDate.of(2024, 7, 23));
		
		System.out.println("User1: "+user1);
		System.out.println("User2: "+user2);
		System.out.println("Order1: "+order1);
		System.out.println("Order2: "+order2);
		
		Pair.swap(user1, user2);
		Pair.swap(order1, order2);
		
		System.out.println("User1: "+user1);
		System.out.println("User2: "+user2);
		System.out.println("Order1: "+order1);
		System.out.println("Order2: "+order2);
		

	}

}
