package Assignments;

import java.util.Scanner;

public class ReversedWords {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String input=sc.nextLine();
		String output="";
		String a[]=input.split("\\s");

		for(int i=a.length-1;i>=0;i--) {
			//System.out.println(a[i]);
			output+=a[i]+" ";
		}
		System.out.println(output);
	}

}
