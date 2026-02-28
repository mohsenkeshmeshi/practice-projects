package t34;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	private List<Item> items = new ArrayList<>();
	
	public ShoppingCart(List<Item> items) {
		this.items = items;
	}
	
	public List<Item> getItems() {
		return items;
	}
	
	class CartIterator {
		
		private int i = 0;
		
		public Item next() {
			return items.get(i++);
		}
	}
	
	public CartIterator createIterator() {
		return new CartIterator();
	}

}
