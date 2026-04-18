package t56;

import java.util.List;

public class Utility {

	public static void swap(List<?> list, int i, int j) {
		swapHelper(list, i, j);
	}
	
	private static <T> void swapHelper(List<T> list, int i, int j) {
		
		T temp = list.get(i);
		list.set(i, list.get(j));
		list.set(j, temp);
	}
}
