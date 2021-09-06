package Day8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class CollectionsEx {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("Arasakumaran");
		al.add(53763303);
		al.add(5.06);
		al.add("Dindigul");
				
		System.out.println(al);
		
		ArrayList bl=new ArrayList();
		bl.add("kuar");
		bl.add(3303);
		
		System.out.println(bl);
		
		al.addAll(bl);
		
		System.out.println(al);
		
		bl.clear();
		System.out.println(bl);
		
		System.out.println(al.contains("Arasakumaran"));
		
		ArrayList cl=new ArrayList();
		cl.add("Arasakumaran");
		cl.add(5.06);
		al.addAll(cl);
		System.out.println(al.containsAll(cl));
		
		System.out.println(bl.isEmpty());
		
		Iterator it=al.iterator();
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		ListIterator lit=al.listIterator();
		while(lit.hasNext()) {
			
			System.out.println(lit.next());
		}		
		System.out.println(al.size());
		cl.remove("Arasakumaran");
		System.out.println(cl);
		al.removeAll(cl);
		System.out.println(al);
	}

}
