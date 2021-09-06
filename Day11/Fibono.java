package Day11;

import java.util.Scanner;
import java.util.function.IntFunction;

class Fibonacci {
	public void display(int num) {
		int prev = 0, current = 1, next = 0, itr = 2;
		if (num == 1)
			System.out.println(prev);
		else if (num == 2) {
			System.out.println(current);
		} else {
			while (itr < num) {
				next = prev + current;
				prev = current;
				current = next;
				itr++;
				
			}
			System.out.println(next);
		}

	}

}

public class Fibono {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");
		int n = sc.nextInt();
		IntFunction in = (o1) -> {
			Fibonacci fb = new Fibonacci();
			fb.display(o1);
			return o1;

		};
		
		in.apply(n);

	}

}
