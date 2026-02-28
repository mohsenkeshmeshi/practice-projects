package t31;

public class Button {
	
	private Runnable action;
	
	public Button(Runnable action) {
		this.action = action;
	}
	
	public void onClick() {
		System.out.println("Button Clicked");
		action.run();
	}

}
