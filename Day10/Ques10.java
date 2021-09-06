package Day10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

@SuppressWarnings("unchecked")
public class Ques10 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		Scanner sc=new Scanner(System.in);
		a.add(1);
		a.add(11);
		a.add(111);
		a.add(12);
		a.add(31);
	
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
	}

}
