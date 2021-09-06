package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first string:");
		String input1=sc.next();
		System.out.println("Enter the second string:");
		String input2=sc.next();
		input1.replaceAll("\\s","");
		input2.replaceAll("\\s","");
		char in1[]=input1.toLowerCase().toCharArray();
		char in2[]=input2.toLowerCase().toCharArray();
		Arrays.sort(in1);
		Arrays.sort(in2);
		//System.out.println(in1);
		//System.out.println(in2);
		if(Arrays.equals(in1,in2)) {
			System.out.println("They are anagrams");
		}else {
			System.out.println("They are not anagrams");
		}
	}

}
