package Day10;

import java.util.ArrayList;
import java.util.Iterator;
@SuppressWarnings("unchecked")
public class Ques2 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(1);
		a.add(11);
		a.add(111);
		a.add(12);
		a.add(31);
		
		Iterator it=a.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
