package Day10;

import java.util.HashSet;
@SuppressWarnings("unchecked")
public class Ques15 {

	public static void main(String[] args) {
		HashSet hs1=new HashSet();
		hs1.add(1);
		hs1.add(21);
		hs1.add(31);
		hs1.add(41);
		
		HashSet hs2=new HashSet();
		hs2.add(1);
		hs2.add(21);
		hs2.add(89);
		hs2.add(41);
		
		hs1.retainAll(hs2);
		System.out.println(hs1);//It contains only the common
		
	}

}
