package Assignments;

import java.util.Scanner;

class Reverse{
	
	void reverse(String str)
	{
		if ((str==null)||(str.length() <= 1))
		System.out.println(str);
		else
		{
			System.out.print(str.charAt(str.length()-1));
			reverse(str.substring(0,str.length()-1));
		}
	}
	
	
	public static void main(String[] args)
	{
		System.out.println("Enter the string:");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		Reverse obj = new Reverse();
		obj.reverse(str);
	}
}
