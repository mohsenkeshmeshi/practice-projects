package t55;

import java.util.Arrays;
import java.util.List;

public class main {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(17,19,15,18,20);
		List<String> names = Arrays.asList("Taha","Nima","Sina","Sam");
		List<Double> prices = Arrays.asList(1200.0,3500.0,4800.0,6000.0,7500.0);
		
		Utility.printList(numbers);
		Utility.printList(names);
		Utility.printList(prices);

	}

}
