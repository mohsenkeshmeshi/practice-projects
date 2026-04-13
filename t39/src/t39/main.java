package t39;

import java.io.IOException;

public class main {

	public static void main(String[] args) {
		FileProcessor fp = new FileProcessor();
		
		try {
			String res = fp.processFile("C:\\Users\\Mohsen\\Downloads\\Test.txt");
			System.out.println(res);
		}
		catch(IOException e) {
			System.out.println("خطا در main");
			e.printStackTrace();
		}

	}

}
