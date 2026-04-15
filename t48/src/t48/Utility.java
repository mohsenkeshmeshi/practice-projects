package t48;

public class Utility {
	
	public static <T extends Comparable<T>> T max(T[] array) {
		
		if(array == null || array.length == 0) {
			throw new IllegalArgumentException("آرایه خالی است");
		}
		
		T max = array[0];
		
		for(T item : array) {
			if(item.compareTo(max) > 0) {
				max = item;
			}
		}
		
		return max;
	}

}
