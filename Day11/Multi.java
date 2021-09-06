package Day11;

import java.util.Scanner;
import java.util.function.IntFunction;

class Multiples {
	public void display(int num) {
		if (num % 3 == 0 && num % 5 == 0) {
			System.out.println("divisible by both 5 and 3");
		} else if (num % 3 == 0) {
			System.out.println("divisible by 3");
		} else if (num % 5 == 0) {
			System.out.println("divisible by 5");
		} else {
			System.out.println(num);
		}
	}
}

public class Multi {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		IntFunction in=(o1)->{
			Multiples m=new Multiples();
			m.display(o1);
			return o1;
	};
	System.out.println("Enter the number");
	int n=sc.nextInt();
   in.apply(n);

}
}
