package Day7;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;


public class ObjectStreamEx {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of students:");
		int n=sc.nextInt();
		Student s[]=new Student[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter the rollnumber:");
			int a=sc.nextInt();
			System.out.println("Enter the name:");
			String b=sc.next();
			System.out.println("Enter the department:");
			String c=sc.next();
			System.out.println("Enter the address:");
			String d=sc.next();
			
			 s[i]=new Student(a,b,c,d);
		}
		
		
  
		  for(int i=0;i<n;i++) {
			  try {
				  
				  FileOutputStream fout=new FileOutputStream(s[i].department+".txt");    
				  ObjectOutputStream out;
				out = new ObjectOutputStream(fout);
				out.writeObject(s[i].toString());
				out.flush();        
				  out.close(); 
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}      
		  }
		  
		     

	}

}
