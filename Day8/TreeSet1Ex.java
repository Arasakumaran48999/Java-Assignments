package Day8;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet1Ex {

	public static void main(String[] args) {
		TreeSet ts=new TreeSet(new Employee1());
		ts.add(new Employee(32,"Arasakumarn",8746));
		ts.add(new Employee(33,"kumarn",3446));
		ts.add(new Employee(34,"Als",2346));
		System.out.println(ts);
		

	}

}
