package t59;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Utility {

	public static int findTaskIndex(List<Task> tasks, Task target) {
		return tasks.indexOf(target);
	}
	
	public static List<Task> highPriorityTask(List<Task> tasks) {
		
		List<Task> result = new ArrayList<>();
		
		for(Task t: tasks) {
			if(t.getPriority() == 1) {
				result.add(t);
			}
		}
		return result;
	}
}
