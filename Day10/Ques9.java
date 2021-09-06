package Day10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

@SuppressWarnings("unchecked")
public class Ques9 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		Scanner sc=new Scanner(System.in);
		a.add(1);
		a.add(11);
		a.add(111);
		a.add(12);
		a.add(31);
		System.out.println("Enter the element :");
		int c=sc.nextInt();
		
		a.set(2,c);
		
		Iterator it=a.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
