package t38;

public class main {

	public static void main(String[] args) {
		DatabaseService service = new DatabaseService();
		
		try {
			service.connectToDB("");
		}
		catch(DatabaseConnectionException e) {
			System.out.println(e.getMessage());
			System.out.println("علت اصلی خطا : "+e.getCause());
			e.printStackTrace();
		}
	}

}
