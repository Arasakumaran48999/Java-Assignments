package arasakumaran;
import java.util.*;
public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int num=sc.nextInt();
		System.out.println("Enter the 2nd number");
		int num1=sc.nextInt();
		int result = (num > num1) ? num: num1; 
		System.out.println(result+" is the greatest number");
	}

}
