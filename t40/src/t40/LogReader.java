package t40;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LogReader {

	public void readLogs(String path) throws IOException {
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line;
			while((line = br.readLine()) != null) {
				System.out.println("LOG : "+line);
			}
			if(line == null) {
				throw new EOFException("");
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("فایل پیدا نشد");
		}
		catch(EOFException e) {
			System.out.println("به انتهای فایل رسیدیم");
		}
	}
}
