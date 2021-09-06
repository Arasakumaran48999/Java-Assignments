package Day11;

import java.util.Scanner;
import java.util.function.IntFunction;

class Fibonacci1 {
	public void display(int num) {
		int prev = 0, current = 1, next = 0, itr = 2, sum = 0;
		while (itr < num) {
			next = prev + current;
			prev = current;
			current = next;

			if (next % 2 == 0)

				sum+=next;

			itr++;
		}
		System.out.println(sum);

	}
}

public class SumFibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IntFunction in = (o1) -> {
			Fibonacci1 fb = new Fibonacci1();
			fb.display(o1);
			return o1;

		};
		System.out.println("Enter the number");
		int n = sc.nextInt();
		in.apply(n);

	}

}
