package Assignments;

import java.util.Scanner;

public class Rotation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String input1=sc.nextLine();
		System.out.println("Enter the second string:");
		String input2=sc.nextLine();
		input1=input1+input1;
		if(input1.contains(input2)) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}

}
