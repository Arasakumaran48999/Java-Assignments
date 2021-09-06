package Day10;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
@SuppressWarnings("unchecked")
public class Ques3 {

	public static void main(String[] args) {
		ArrayDeque a=new ArrayDeque();
		Scanner sc=new Scanner(System.in);
		a.add(1);
		a.add(11);
		a.add(111);
		a.add(12);
		a.add(31);
		
		System.out.println("Enter the element need to be added at front:");
		int h=sc.nextInt();
		a.offerFirst(h);

		Iterator it=a.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
