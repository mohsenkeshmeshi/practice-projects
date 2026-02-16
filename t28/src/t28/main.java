package t28;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

public class main {

	public static void main(String[] args) throws InterruptedException {
		
		Supplier<LocalDateTime> timeSupplier = () -> LocalDateTime.now();
		
		for(int i = 1; i <= 5; i++) {
			LocalDateTime t = TimeUtil.getCurrentTime(timeSupplier);
			System.out.println("Time "+ i+ ": "+ t);
			TimeUnit.SECONDS.sleep(i);
		}

	}

}
