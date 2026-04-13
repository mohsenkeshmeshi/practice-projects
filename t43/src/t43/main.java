package t43;

public class main {

	public static void main(String[] args) {
		ServerMonitor monitor = new ServerMonitor();
		
		monitor.startServer(false, false);
		monitor.startServer(true, true);
	}

}
