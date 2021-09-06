package Assignments;

import java.util.Scanner;

public class VowelsConsonants {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String input=sc.next();
		input=input.toLowerCase();
		int count=0;
		int count1=0;
		for(int i=0;i<input.length();i++) {
			char c=input.charAt(i);
			if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u')) {
				count++;
			}else {
				count1++;
			}
		}
		System.out.println("The number of vowels in given string:"+count);
		System.out.println("The number of constants in given string:"+count1);

	}

}
