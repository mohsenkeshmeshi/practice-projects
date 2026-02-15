package t22;

public class FileLogger implements Logger{

	@Override
	public void logToDestination(String msg) {
		System.out.println("File Saved : "+ msg);
	}
}
