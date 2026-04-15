package t44;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class SecurityLogger {
	private final Logger logger;
	
	public SecurityLogger() {
		logger = Logger.getLogger(SecurityLogger.class.getName());
		logger.setUseParentHandlers(false);
		
		ConsoleHandler handler = new ConsoleHandler();
		handler.setLevel(Level.WARNING);
		handler.setFormatter(new SimpleFormatter());
		
		logger.addHandler(handler);
		logger.setLevel(Level.WARNING);
	}
	
	public void suspiciousRequests() {
		for(int i = 0; i < 9; i++) {
			logger.warning("درخواست مشکوک از IP: 192.168.1.1");
		}
	}

}
