package Day10;

import java.util.HashSet;
import java.util.Set;

public class Ques11 {

	public static void main(String[] args) {
		Set<String> hs=new HashSet<>();
		hs.add("Hi");
		hs.add("This ");
		hs.add("Is");
		hs.add("Arasakumaran");
		
		String[] a = hs.toArray(new String[hs.size()]);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
	}

}
