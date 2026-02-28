package t34;

import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		
		ShoppingCart sc = new ShoppingCart(Arrays.asList(new Item("item1"),
														 new Item("item2"),
														 new Item("item3")));
		ShoppingCart.CartIterator ci = sc.createIterator();
		
		for(int i = 0; i < sc.getItems().size(); i++) {
			System.out.println(ci.next().getName());
		}
	}

}
