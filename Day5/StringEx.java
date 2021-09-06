package Day5;
import java.util.Scanner;
public class StringEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String s1 = sc.nextLine();
		String s2 = new String("Arasakumaran"); 		
		System.out.println(s2);
		char c[] = {'a','r','a','s','a'};				
		String s3 = new String(c);
		System.out.println(s3);
		String s4 = new String(c,1,3);
		System.out.println(s4);							
		byte b[]= {54,45,25,84,98};
		String s5 = new String(b);
		System.out.println(s5);							
		byte d[] = { 65, 66, 67, 68, 69, 70 }; 
		String s6 = new String(c, 1, 2);  
		System.out.println(s6);							
		System.out.println(s1.toLowerCase());			
		System.out.println(s1.toUpperCase());			
		System.out.println(s1.charAt(0));				
		System.out.println(s1.charAt(0)==s1.charAt(1));	
		
		
		StringBuilder sb=new StringBuilder("Hello ");  
		sb.append("kumaran");
		System.out.println(sb);
		sb.insert(1,"Mepco");
		System.out.println(sb);
		sb.replace(1,3,"Schelnk");  
		System.out.println(sb);
		sb.delete(1,3);  
		System.out.println(sb);
		sb.reverse();  
		System.out.println(sb);
		System.out.println(sb.capacity());
		sb.ensureCapacity(50);    
		System.out.println(sb.capacity());
		String ss=sb.substring(1,3);
		System.out.println(ss);
		String ss1=sb.substring(3);
		System.out.println(ss1);

		StringBuffer aa=new StringBuffer("Arasakumaran ");  
		aa.append("Mepco");
		aa.insert(1,"schelnk");
		System.out.println(aa);
		aa.replace(1,3,"Engineering");  
		System.out.println(aa);
		aa.delete(1,3);  
		System.out.println(aa);
		aa.reverse();  
		System.out.println(aa);
		
	}

}
