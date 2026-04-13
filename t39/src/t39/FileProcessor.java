package t39;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileProcessor {
	public String processFile(String path) throws IOException {
		try {
			String content = Files.readString(Path.of(path));
			int num = Integer.parseInt(content.trim());
			return "عدد خوانده شده : "+num;
		}
		catch(NumberFormatException e) {
			System.out.println("خطا : فرمت عدد اشتباه است");
			return null;
		}
		catch(IOException e) {
			System.out.println("خطا : خطا در خواندن فایل ||| فایل یا مسیر مشکل دارد");
			return null;
		}
		
		
	}

}
