package Day5;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("MY CALCULATOR");
		int choice=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the function u are in need:");
		do {
			System.out.println("1.abs\t2.cos\t3.sin\t4.tan\n5.ceil\t6.floor\t7.log\t8.max\n9.min\t10.sqroot\t11.power\t12.cuberoot\n13.log10\t14.acos\t15.asin\t16.atan\t17.signum\t18.rint\n19.Exp\t20.expm1");
			choice=sc.nextInt();
			System.out.println("Enter the value:");
			int i=sc.nextInt();
			switch(choice) {
			case 1:{
				System.out.println(Math.abs(i));				
			}
			case 2:{
				System.out.println(Math.cos(i));
				break;
			}
			case 3:{
				System.out.println(Math.sin(i));
				break;
			}
			case 4:{
				System.out.println(Math.tan(i));
				break;
			}
			case 5:{
				System.out.println(Math.ceil(i));
				break;
			}
			case 6:{
				System.out.println(Math.floor(i));
				break;
			}
			case 7:{
				System.out.println(Math.log(i));
				break;
			}
			case 8:{
				System.out.println("Enter the second value");
				int j=sc.nextInt();
				System.out.println(Math.max(i,j));
				break;
			}
			case 9:{
				System.out.println("Enter the second value");
				int j=sc.nextInt();
				System.out.println(Math.min(i,j));
				break;
			}
			case 10:{
				System.out.println(Math.sqrt(i));
				break;
			}
			case 11:{
				System.out.println("Enter the second number");
				int j=sc.nextInt();
				System.out.println(Math.pow(i,j));
				break;
			}
			case 12:{
				System.out.println(Math.cbrt(i));
				break;
			}
			case 13:{
				System.out.println(Math.log10(i));
				break;
			}
			case 14:{
				System.out.println(Math.acos(i));
				break;
			}
			case 15:{
				System.out.println(Math.asin(i));
				break;
			}
			case 16:{
				System.out.println(Math.atan(i));
				break;
			}
			case 17:{
				System.out.println(Math.signum(i));
				break;
			}
			case 18:{
				System.out.println(Math.rint(i));
				break;
			}
			case 19:{
				System.out.println(Math.exp(i));
				break;
			}
			case 20:{
				System.out.println(Math.expm1(i));
				break;
			}
			}
		}while(choice<21);

	}

}
