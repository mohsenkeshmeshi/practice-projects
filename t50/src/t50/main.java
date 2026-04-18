package t50;

import java.util.Arrays;
import java.util.List;

public class main {

	public static void main(String[] args) {
		
		List<Double> salaries = Arrays.asList(35_000_000.0,30_000_000.0,46_000_000.0,55_000_000.0);
		DataProcessor<Double> salariesProcessor = new DataProcessor<>();
		
		double avgSalary = salariesProcessor.calculateAverage(salaries);
		
		System.out.println("میانگین حقوق : "+avgSalary);
		
		List<Integer> grades = Arrays.asList(18,15,19,20);
		DataProcessor<Integer> gradesProcessor = new DataProcessor<>();
		
		double avgGrade = gradesProcessor.calculateAverage(grades);
		
		System.out.println("میانگین نمرات : "+avgGrade);
		

	}

}
