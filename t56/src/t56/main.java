package t56;

import java.util.Arrays;
import java.util.List;

public class main {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Taha", "Nima", "Sina");
		
		System.out.println("Before Swap: "+names);
		
		Utility.swap(names, 1, 2);

		System.out.println("After Swap: "+names);
		
	}

}
