package t38;

public class DatabaseService {

	public void connectToDB(String url) {
		if(url == null || url.isEmpty()) {
			DatabaseConnectionException e = new DatabaseConnectionException("خطا : URL خالی است");
			e.initCause(new IllegalArgumentException("URL نمی تواند خالی باشد"));
			throw e;
		}
	}
}
