package Day10;

import java.util.HashSet;
@SuppressWarnings("unchecked")
public class Ques14 {

	public static void main(String[] args) {
		HashSet hs1=new HashSet();
		hs1.add(1);
		hs1.add(21);
		hs1.add(31);
		hs1.add(41);
		
		HashSet hs2=new HashSet();
		hs2.add(1);
		hs2.add(21);
		hs2.add(31);
		hs2.add(41);
		
		System.out.println(hs1.equals(hs2));		//The values also must be equal for true orelse false 
	}

}
