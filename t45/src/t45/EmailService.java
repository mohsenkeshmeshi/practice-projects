package t45;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EmailService {

	private final Logger logger = Logger.getLogger(EmailService.class.getName());
	
	public void sendEmail(String to, String msg) {
		try
		{
			if(to == null || !to.contains("@")) {
				throw new IOException("آدرس ایمیل نا معتبر است");
			}
		
			System.out.println("ایمیل با موفقیت ارسال شد به: "+to);
		}
		catch(IOException e) {
			logger.log(Level.SEVERE, "خطا در ارسال ایمیل", e);
		}
		
	}
}
