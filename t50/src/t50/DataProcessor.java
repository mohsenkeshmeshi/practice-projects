package t50;

import java.math.BigDecimal;
import java.util.List;

public class DataProcessor<T extends Number> {

	public double calculateAverage(List<T> list) {
		
		if(list == null || list.isEmpty()) {
			throw new IllegalArgumentException("لیست خالی است");
		}
		
		double sum = 0;
		
		for(T item: list) {
			if(item instanceof Integer ||
			   item instanceof Double ||
			   item instanceof BigDecimal) {
				
				sum += item.doubleValue();
			}
			else {
				throw new IllegalArgumentException("نوع داده پشتیبانی نمی شود"+item.getClass());
			}
		}
		
		return sum / list.size();
	}
}
