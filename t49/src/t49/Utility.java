package t49;

import java.util.List;

public class Utility {

	public static <T> void copy(List<T> dest, List<T> src) {
		
		if(dest.size() < src.size()) {
			throw new IllegalArgumentException("لیست مقصد کوچک تر از لیست مبدا است");
		}
		
		for(int i = 0; i<src.size(); i++) {
			dest.set(i, src.get(i));
		}
	}
}
