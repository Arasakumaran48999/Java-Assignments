package Assignments;

import java.util.Scanner;

public class ContainsOnlyDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String input=sc.next();
		int flag=0;
		for(int i=0;i<input.length();i++) {
			if(Character.isDigit(input.charAt(i))) {
				flag=0;
			}else {
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("The string contains only digits");
		}else {
			System.out.println("The string contains digits and others");
		}
	}

}
