package t22;

import java.time.LocalDateTime;

public interface Logger {
	
	default void log(String msg) {
		System.out.println(LocalDateTime.now()+ "-"+ msg);
		logToDestination(msg);
	}
	
	void logToDestination(String msg);

}
