package Day10;

import java.util.Scanner;
import java.util.TreeSet;
@SuppressWarnings("unchecked")
public class Ques21 {

	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element");
		int s=sc.nextInt();
		ts.add(100);
		ts.add(200);
		ts.add(300);
		ts.add(400);
		ts.add(500);
		
		ts.remove(s);//remove
		
		System.out.println(ts);	
	}

}
