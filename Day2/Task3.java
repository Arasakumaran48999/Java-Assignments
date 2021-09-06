package arasakumaran;
import java.util.*;
public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int last=num%10;
		if(last%3==0) {
			if(last%5==0) {
				System.out.println("Divisible by 3 and 5");
			}else {
				System.out.println("Divisible by 3 and not by 5");
			}
		}
		else {
			System.out.println("Not Divisible by 3");
		}
	}

}
