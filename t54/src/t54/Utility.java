package t54;

import java.util.List;

public class Utility {

	public static void addItems(List<? super Product> list) {
		list.add(new Product("Laptop", 15000));
		list.add(new Product("PowerBank", 500));
		list.add(new Product("PC", 12500));
	}
}
