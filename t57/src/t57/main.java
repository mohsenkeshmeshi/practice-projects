package t57;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class main {

	public static void main(String[] args) {
		
		List<String> logs = new ArrayList<>();
		logs.add("INFO: Application Started");
		logs.add("ERROR: Database Connection Failed");
		logs.add("WARNING: Low Memory");
		logs.add("ERROR: Null Pointer Exception");
		logs.add("INFO: Request Processed");
		
		Iterator<String> it = logs.iterator();
		
		while(it.hasNext()) {
			String msg = it.next();
			
			if(msg.contains("ERROR")) {
				it.remove();
			}
		}
		for(String log : logs) {
			System.out.println(log);
		}

	}

}
