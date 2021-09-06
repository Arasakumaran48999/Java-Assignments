package Assignments;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String input1=sc.nextLine();
		input1=input1.toLowerCase();
		StringBuilder sb=new StringBuilder(input1);  
		sb.reverse();  
		String rev=sb.toString();  
		if(input1.equals(rev)){  
		        System.out.println("The given string is a palindrome");
		    }else{  
		    	System.out.println("The given string is not a palindrome");
		    }  
		}  
	}


