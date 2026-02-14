package t6;

import java.util.Scanner;
public class AttendanceSystem {
	public static void main(String[] args) {
		int totalHours = 0;
		Scanner in = new Scanner(System.in);
		
		for(int day = 1; day <= 30; day++) {
			if(day % 7 == 6 || day % 7 == 0) {
				System.out.println("روز"+day+"تعطیل است");
				continue;
			}
			System.out.println("تعداد ساعت کاری روز "+day+"را وارد کنید (برای خروج -1)");
			int hour = in.nextInt();
			
			if(hour == -1) {
				System.out.println("ثبت حضور غیاب متوقف شد");
				break;
			}
			totalHours += hour;
		}
		System.out.println("جمع ساعات کاری این ماه :"+totalHours);
	}
}
