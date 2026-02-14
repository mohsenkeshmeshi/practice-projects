package t8;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class ProjectManagement {

	public static void main(String[] args) {
		LocalDate start = LocalDate.of(2026, 1, 20);
		LocalDate end = LocalDate.of(2026, 7, 1);
		
		long workingDays = 0;
		for(LocalDate cntDate = start; cntDate.isBefore(end) || cntDate.isEqual(end); cntDate = cntDate.plusDays(1)) {
			if(cntDate.getDayOfWeek() == DayOfWeek.FRIDAY) {
				continue;
			}
			workingDays++;
		}
		
		System.out.println("تعداد روزهای کاری پروژه :"+workingDays);
		
		LocalDate today = LocalDate.now();
		if(end.isAfter(today)) {
			System.out.println("پروژه تاخیر دارد");
		}

	}

}
