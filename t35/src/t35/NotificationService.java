package t35;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {

	private List<EventListener> listeners = new ArrayList<>();
	
	public void addListener(EventListener l) {
		listeners.add(l);
	}
	
	public void fireEvent(String event) {
		for(EventListener l : listeners) {
			l.onEvent(event);
		}
	}

}
