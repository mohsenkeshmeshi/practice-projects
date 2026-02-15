package t22;

public class main {

	public static void main(String[] args) {
		
		Logger console = new ConsoleLogger();
		Logger file = new FileLogger();
		
		console.log("در حال ذخیره در کنسول");
		file.log("در حال ذخیره در فایل");

	}

}
