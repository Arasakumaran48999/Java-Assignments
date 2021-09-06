package Day8;

import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		ts.add(34);
		ts.add(45);
		ts.add(0);
		ts.add(-98);
		
		System.out.println(ts);
		
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println(ts.headSet(12));
		System.out.println(ts.tailSet(12));
		System.out.println(ts.subSet(0,45));
		System.out.println(ts.ceiling(-98));
		System.out.println(ts.ceiling(-95));
		System.out.println(ts.higher(-98));
		System.out.println(ts.floor(12));
		System.out.println(ts.lower(12));
		System.out.println(ts.headSet(12,true));
		System.out.println(ts.headSet(12,false));
		System.out.println(ts.tailSet(12,true));
		System.out.println(ts.tailSet(12,false));
		System.out.println(ts.pollFirst());
		System.out.println(ts.pollLast());
	}

}
