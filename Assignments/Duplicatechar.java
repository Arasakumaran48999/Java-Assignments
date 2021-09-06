package Assignments;

import java.util.Scanner;

public class Duplicatechar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String input=sc.next();
		char a[]=input.toCharArray();
		for(int i=0;i<input.length();i++) {					
			int count=1;
			for(int j=i+1;j<input.length();j++) {
				if((a[i]==a[j])&&(a[i]!='0')) {
					count++;
					a[j]='0';
					//System.out.println("hi");
				}
			}

			if((count>1)&&(a[i]!='0')){
				System.out.println("The letter "+a[i]+" is duplicated "+count+" times");
			}
		}

	}

}
