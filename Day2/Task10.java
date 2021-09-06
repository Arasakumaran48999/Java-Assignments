package arasakumaran;

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice1=0;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("1.Arithmetic\n2.relational\n3.logical\n4.exit");
			choice1=sc.nextInt();
			switch(choice1){	
			case 1:{
				int choice2=0;
				do {
					System.out.println("1.addition\n2.subtraction\n3.division\n4.multiplication\n5.modulo\n6.exit");
					choice2=sc.nextInt();
					switch(choice2) {
					case 1:{
						System.out.println("enter two values:");
						int a=sc.nextInt();
						int b=sc.nextInt();
						System.out.println(a+b);
						break;
					}
					case 2:{
						System.out.println("enter two values:");
						int a=sc.nextInt();
						int b=sc.nextInt();
						System.out.println(a-b);
						break;
					}
					case 3:{
						System.out.println("enter two values:");
						int a=sc.nextInt();
						int b=sc.nextInt();
						System.out.println(a*b);
						break;
					}
					case 4:{
						System.out.println("enter two values:");
						int a=sc.nextInt();
						int b=sc.nextInt();
						System.out.println(a/b);
						break;
					}
					case 5:{
						System.out.println("enter two values:");
						int a=sc.nextInt();
						int b=sc.nextInt();
						System.out.println(a%b);
						break;
					}
					case 6:{
						break;
					}
					}
				}while(choice2<6);
			}
			case 2:{
				int choice3=0;
				do {
					System.out.println("1.isequalto\n2.notequalto\n3.greaterthan\n4.lesserthan\n5.greaterthanorequalto\n6.lesserthanorequalto\n7.exit");
					choice3=sc.nextInt();
					switch(choice3) {
					case 1:{
						System.out.println("enter two values:");
						int a=sc.nextInt();
						int b=sc.nextInt();
						System.out.println(a==b);
						break;
						}
					case 2:{
						System.out.println("enter two values:");
						int a=sc.nextInt();
						int b=sc.nextInt();
						System.out.println(a!=b);
						break;
					}
					case 3:{
						System.out.println("enter two values:");
						int a=sc.nextInt();
						int b=sc.nextInt();
						System.out.println(a>b);
						break;
					}
					case 4:{
						System.out.println("enter two values:");
						int a=sc.nextInt();
						int b=sc.nextInt();
						System.out.println(a<b);
						break;
					}
					case 5:{
						System.out.println("enter two values:");
						int a=sc.nextInt();
						int b=sc.nextInt();
						System.out.println(a>=b);
						break;
					}
					case 6:{
						System.out.println("enter two values:");
						int a=sc.nextInt();
						int b=sc.nextInt();
						System.out.println(a<=b);
						break;
					}
					case 7:{
						break;
					}
					}

					
				}while(choice3<7);
			}
			case 3:{
				int choice4=0;
				do {
					System.out.println("1.AND\n2.OR\n3.NOT\n4.Exit");
					choice4=sc.nextInt();
					switch(choice4) {
					case 1:{
						System.out.println("enter two values:");
						int a=sc.nextInt();
						int b=sc.nextInt();
						if((a<10)&&(b<10)) {
							System.out.println("both the values are lesser than ten");
						}else {
							System.out.println("Greater than ten");
						}
						break;
					}
					case 2:{
						System.out.println("enter two values:");
						int a=sc.nextInt();
						int b=sc.nextInt();
						if((a<10)||(b<10)) {
							System.out.println("value are lesser than ten");
						}else {
							System.out.println("Both the values are Greater than ten");
						}
						break;
					}
					case 3:{
						System.out.println("enter two values:");
						int a=sc.nextInt();
						int b=sc.nextInt();
						if(!(a<b)) {
							System.out.println("A is greater");
						}else {
							System.out.println("B is greater");
						}
						break;
					}
					case 4:{
						break;
					}
					}
					
				}while(choice4<4);
			}
			
			
			}
		}while(choice1<4);
		
	}

}
