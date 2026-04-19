package t59;

import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		
		 List<Task> tasks = new ArrayList<>();
		 
		 tasks.add(new Task(1, "Design UI", 2));
		 tasks.add(new Task(2, "Fix Bugs", 1));
		 tasks.add(new Task(3, "Deploy To Server", 1));
		 tasks.add(new Task(4, "Write Documentation", 3));		 

		 tasks.remove(new Task(4, "Write Documentation", 3));
		 
		 Task target = new Task(1, "Design UI", 2);
		 int index = Utility.findTaskIndex(tasks, target);
		 
		 System.out.println("ایندکس تسک خاص :"+index);
		 
		 List<Task> highPriority = Utility.highPriorityTask(tasks);
		 
		 for(Task t: highPriority) {
			 System.out.println(t);
		 }
	}

}
