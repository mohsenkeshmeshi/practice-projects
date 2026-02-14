package t19;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		
		shapes.add(new Circle(7));
		shapes.add(new Rectangle(4, 3));
		
		for(Shape s : shapes) {
			System.out.println("مساحت = " + s.getArea());
		}
	}

}
