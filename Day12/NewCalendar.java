package Day12;

import java.time.LocalDate;
import java.time.Period;

public class NewCalendar {

	public static void main(String[] args) {
		LocalDate l = LocalDate.of(1999, 8, 4); 
		  LocalDate now = LocalDate.now();
		  Period diff = Period.between(l, now); 
		  System.out.println(diff.getYears() + "years" + diff.getMonths() + "months" + diff.getDays() + "days");
		 
		
	}

}
