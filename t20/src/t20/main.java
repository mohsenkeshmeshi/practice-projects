package t20;

public class main {

	public static void main(String[] args) {
		
		Order order = new Order();
		
		System.out.println("وضعیت فعلی : "+ order.getStatus());
		order.advance();
		
		System.out.println("وضعیت بعد از صدا زدن متد advance : "+ order.getStatus());
		order.advance();
		
		System.out.println("وضعیت بعد از صدا زدن متد advance : "+ order.getStatus());
		order.advance();
		
		System.out.println("وضعیت بعد از صدا زدن متد advance : "+ order.getStatus());
		order.advance();
		
		System.out.println("وضعیت بعد از صدا زدن متد advance : "+ order.getStatus());
		order.advance();
		
		System.out.println("وضعیت بعد از صدا زدن متد advance : "+ order.getStatus());

	}

}
