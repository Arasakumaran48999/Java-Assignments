package Day12;

import java.util.Calendar;

public class Calendarr {

	public static void main(String[] args) {
		/*Calendar cal=Calendar.getInstance();
		System.out.println(cal.getTime());
		cal.add(Calendar.YEAR,4);
		System.out.println(cal.getTime());
		cal.add(Calendar.MONTH,6);
		System.out.println(cal.getTime());*/
		
		Calendar now = Calendar.getInstance();
		Calendar dob = Calendar.getInstance();
		
		int year1 = now.get(Calendar.YEAR);
		int year2 = 1999;
		int age = year1 - year2;
		int month1 = now.get(Calendar.MONTH);
		int month2 = 8;
		System.out.println(age);
		System.out.println(year1-year2);
		  int day1 = now.get(Calendar.DAY_OF_MONTH);
		  int day2 = 4;
		  if(month1>month2) {
			  System.out.println(month1-month2);  
		  }else {
			  System.out.println(month2-month1);
		  }
		  if(day1>day2) {
			  System.out.println(day1-day2);  
		  }else {
			  System.out.println(day2-day1);
		  }

		
	}	
	
}
