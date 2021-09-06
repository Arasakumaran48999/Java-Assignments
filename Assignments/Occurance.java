package Assignments;

import java.util.Scanner;

public class Occurance {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String input=sc.next();
		input=input.toLowerCase();
		System.out.println("Enter the character:");
		char c=sc.next().charAt(0);
		int count=0;
		for(int i=0;i<input.length();i++) {
			if(c==input.charAt(i)) {
				count++;
			}
		}
		System.out.println("The character "+c+" is occured "+count+" times");
	}

}
