package t30;

public class main {

	public static void main(String[] args) {
		
		StringProcessor p1 = s -> Utility.toUpper(s);
		StringProcessor p2 = s -> Utility.reverse(s);
		StringProcessor p3 = s -> Utility.removeSpace(s);
		
		String input = "Java is the Best";
		
		System.out.println(p1.process(input));
		System.out.println(p2.process(input));
		System.out.println(p3.process(input));

	}

}
