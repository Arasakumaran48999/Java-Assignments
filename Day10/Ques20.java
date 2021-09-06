package Day10;

import java.util.Scanner;
import java.util.TreeSet;
@SuppressWarnings("unchecked")
public class Ques20 {

	public static void main(String[] args) {
		TreeSet ts=new TreeSet();

		ts.add(100);
		ts.add(200);
		ts.add(300);
		ts.add(400);
		ts.add(500);
		
		int h=(int) ts.pollLast();
		System.out.println(h);	//retrive and remove
		
		System.out.println(ts);	
	}

}
