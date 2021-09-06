package Day10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Ques13 {

	public static void main(String[] args) {
		Set<String> hs=new HashSet<>();
		hs.add("Hi");
		hs.add("This ");
		hs.add("Is");
		hs.add("Arasakumaran");
		
		ArrayList<String> ts=new ArrayList(hs);
		Iterator it=ts.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
