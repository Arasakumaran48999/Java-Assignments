package arasakumaran;

import java.util.*;
public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the three digit number:");
		int num=sc.nextInt();
		if((num>99)&&(num<=999)) {
			System.out.println("The given number is a three digit number");
			while(num>=10) {
				num/=10;
			}
	        if(num%2==0) {
	        	System.out.println("The first number can be divisible by 2");
	        }
	        else {
	        	System.out.println("The first number can not be divisible by 2");
	        }
		}
		else {
			System.out.println("The given number is not a three digit number..check the input");
		}
	}

}
