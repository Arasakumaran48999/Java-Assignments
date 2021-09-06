package arasakumaran;
import java.io.*;
import java.util.*;

public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of characters:");
		int n=sc.nextInt();
		char c[]=new char[n];
		System.out.println("Enter the characters:");
		for(int i=0;i<n;i++) {
			c[i]=sc.next().charAt(0);
		}
		char large=c[0];
		char small=c[0];
		for(int i=0;i<c.length;i++)
		{
			if(c[i]>large)
			{
				large=c[i];
			}
			if(c[i]<small)
			{
				small=c[i];
			}
		}
		System.out.println("Largest Character is " +large + " Smallest Character is "+small);
	}

}
