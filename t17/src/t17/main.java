package t17;

import java.util.ArrayList;
import java.util.OptionalInt;

public class main {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			int randomNum = (int)(Math.random()*100);
			numbers.add(randomNum);
		}
		System.out.println("لیست اعداد :"+numbers);
		
		int sum = numbers.stream().mapToInt(n -> n).sum();
		int max = numbers.stream().mapToInt(n -> n).max().orElse(0);
		int min = numbers.stream().mapToInt(n -> n).min().orElse(0);
		
		String message = """
				جمع اعداد = %s,
				بزرگترین عدد = %s,
				کوچکترین عدد = %s
				""".formatted(sum,max,min);
		System.out.println(message);
		
		

	}

}
