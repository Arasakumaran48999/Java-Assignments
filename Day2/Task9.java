package arasakumaran;
import java.util.*;

import arasa.Em;
public class Task9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of students:");
		int n=sc.nextInt();
		Task99[] obj1=new Task99[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter the roll number:");
			int a=sc.nextInt();
			System.out.println("Enter the name:");
			String b=sc.next();
			System.out.println("Enter the age:");
			int c=sc.nextInt();
			System.out.println("Enter the maths mark:");
			int d=sc.nextInt();
			System.out.println("Enter the physics mark:");
			int e=sc.nextInt();
			System.out.println("Enter the chemistry mark:");
			int f=sc.nextInt();
			obj1[i]=new Task99(a,b,c,d,e,f);
		}
        System.out.println("Please enter the roll number for required grades:");
        int check=sc.nextInt();
        for(int i=0;i<n;i++) {
        	if(obj1[i].rollno==check) {
        		obj1[i].display();
        		System.out.println("The Total:");
        		System.out.println(obj1[i].returntotal());
        		System.out.print("The Average:");
        		System.out.println(obj1[i].returnavg());
        		float h=obj1[i].returnavg();
        		int g=(int)h;
        		grade(g);
        	}
        }
		
	}
	static void grade(int s) {
		if(s>75)
			System.out.println("GRADE:A");
		else if((s>65)&&(s<=75))
			System.out.println("GRADE:B");
		else if((s>35)&&(s<=65))
			System.out.println("GRADE:C");
		else if(s<=35)
			System.out.println("GRADE:D");
	}

}
