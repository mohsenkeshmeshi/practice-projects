package t22;

public class ConsoleLogger implements Logger{
	
	@Override
	public void logToDestination(String msg) {
		System.out.println("Console : "+ msg);
	}
}
