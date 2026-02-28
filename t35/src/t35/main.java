package t35;

public class main {

	public static void main(String[] args) {
		
		NotificationService service = new NotificationService();
		
		service.addListener(l -> System.out.println("Lambda Listener : "+ l));
		
		service.addListener(new EventListener() {
			
			@Override
			public void onEvent(String event) {
				System.out.println("Anonymous Inner Class Listener : "+ event);		
			}
		});
		
		service.fireEvent("Order-Placed");
	}

}
