package t28;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class TimeUtil {
	
	public static LocalDateTime getCurrentTime(Supplier<LocalDateTime> supplier) {
		return supplier.get();
	}

}
