package t43;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ServerMonitor {

	private static final Logger logger = Logger.getLogger(ServerMonitor.class.getName());
	
	public void startServer(boolean portBusy, boolean dbFail) {
		logger.log(Level.INFO, "سرور شروع شد");
		
		if(portBusy)
			logger.log(Level.WARNING, "پورت مورد نظر در حال حاضر اشغال است");
		
		if(dbFail)
			logger.log(Level.SEVERE, "اتصال به پایگاه داده با مشکل مواجه شده است");
	}
}
