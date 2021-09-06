package arasakumaran;
import java.util.*;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String day=sc.nextLine();
		int dayName=0;
		switch (day) {
        case "Monday": dayName = 1 ; break;
        case "Tuesday": dayName = 2; break;
        case "Wednesday": dayName =3 ; break;
        case "Thursday": dayName = 4; break;
        case "Friday": dayName = 5; break;
        case "Saturday": dayName = 6; break;
        case "Sunday": dayName = 7; break;
        default:
        {
        	System.out.println("Please enter the correct day");
        }    
    }
		System.out.println("Day:"+day+" "+"dayName:"+dayName);
	}

}
