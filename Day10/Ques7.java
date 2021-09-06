package Day10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

@SuppressWarnings("unchecked")
public class Ques7 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList(19);
		System.out.println(getCapacity(a));
		a.add(1);
		a.add(11);
		a.add(111);
		a.add(12);
		a.add(31);
		
		System.out.println(a.size());
		a.trimToSize();
		System.out.println(a.size());
	}

	private static char[] getCapacity(ArrayList a) {
		// TODO Auto-generated method stub
		return null;
	}

}
