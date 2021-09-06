package Day3;
import java.io.*;
import java.util.*;

import arasakumaran.Task99;

public class Employee {
	public static void main(String[] args) {
		final int n=100;  //Final Keyword
		final String company_secreate_password="Arasakumaran";
		Scanner sc=new Scanner(System.in);
		Em obj[]=new Em[n];				//Single dimensional array of objects
		Em obj1[]=new Personal[n];		//Dynamic Binding
		Em obj2[]=new Salary[n];
		int count=0;
		int choice1=0;
		do {
			System.out.println("Enter the option u need to do:");
			System.out.println("1.Add employee\n2.Delete Employee\n3.Edit employee\n4.Display\n5.To know more\n6.exit");
			choice1=sc.nextInt();
			switch(choice1) {
			case 1:{
				System.out.println("Enter the employee sapID:");
				int a=sc.nextInt();
				System.out.println("Enter the employee name:");
				String b=sc.next();
				System.out.println("Enter the designation:");
				String c=sc.next();
				System.out.println("Enter the team name:");
				String d=sc.next();
				obj[count]=new Em(a,b,c,d);
				System.out.println("Enter the father name:");
				String e=sc.next();
				System.out.println("Enter the address");
				String f=sc.next();
				System.out.println("Enter the phone number");
				double g=sc.nextDouble();
				System.out.println("Enter the Year of experience");
				int h=sc.nextInt();
				System.out.println("Enter the salary");
				Double i=sc.nextDouble();
				obj1[count]=new Personal(a,b,c,d,e,f,g,h,i);
				obj1[count].display();
				count++;
				break;
			}
			case 2:{
				System.out.println("Enter the first name of the employee you want to delete from the list");
			      String name = sc.next();

			       for (int i = 0; i < count; i++) {
			           if (obj[i].name.equals(name)){
			               obj[i] = null;
			               System.out.println("The employee is successfully deleted");
			           }else {
			        	   System.out.println("The employee is not in the firm");
			           }
			           while(i<count)
			        	   obj[i]=obj[i+1];
				}
			     break;				
			}
			case 3:{
				System.out.println("Enter the sapID for edit");
				int id=sc.nextInt();
				System.out.println("Enter the company password for editing ur profile");
				String s=sc.next();
				if(company_secreate_password.equals(s)) {
					for(int i=0;i<count;i++) {
						if(obj[i].Sapid==id) {
							System.out.println("Enter the employee name:");
							String b=sc.next();
							System.out.println("Enter the designation:");
							String c=sc.next();
							System.out.println("Enter the team name:");
							String d=sc.next();
							obj[count]=new Em(id,b,c,d);
							System.out.println("Enter the father name:");
							String e=sc.next();
							System.out.println("Enter the address");
							String f=sc.next();
							System.out.println("Enter the phone number");
							double g=sc.nextDouble();
							System.out.println("Enter the Year of experience");
							int h=sc.nextInt();
							System.out.println("Enter the salary");
							Double j=sc.nextDouble();
							obj1[count]=new Personal(id,b,c,d,e,f,g,h,j);
						}else {
							System.out.println("Ur id is not found check the Sapid");
						}
					}
				}else {
					System.out.println("The password is incorrect");
				}
				break;
			}
			case 4:{
				for(int i=0;i<count;i++) {
					obj[i].display();
					obj1[i].display();
					System.out.println("-----------------");
				}
				break;
			}
			case 5:{
				int choice2=0;
				do {
					System.out.println("1.your salary\n2.No of employees in the company\n3.exit");
					choice2=sc.nextInt();
					switch(choice2) {
					case 1:{
						System.out.println("Enter the sapID to know ur salary");
						int id=sc.nextInt();
						System.out.println("Enter the password");
						String s=sc.next();
						if(company_secreate_password.equals(s)) {
							for(int i=0;i<count;i++) {
								if(obj[i].Sapid==id) {
									obj[i].salarydetails(567.0,677.0);
								}else {
									System.out.println("Ur id is not found check the Sapid");
								}
							}
						}else {
							System.out.println("The password is incorrect");
						}
						break;
					}
					case 2:{
						System.out.println("The number of employees in our company:"+count);
						break;
					}
					case 3:{
						break;
					}
					}
				}while(choice2>3);
			}
			case 6:{
				break;
			}
			}
		}while(choice1<6);
	}

}


