package t31;

public class main {

	public static void main(String[] args) {
		
		Button b1 = new Button(() -> System.out.println("Button With LambdaExpression"));
		
		Button b2 = new Button(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Button With Anonymous Inner Class");
				
			}
		});
		
		b1.onClick();
		b2.onClick();
	}

}
