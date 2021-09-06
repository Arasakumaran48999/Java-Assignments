package Day11;

import java.util.Scanner;
import java.util.function.Consumer;

class Palindrome {
	public void printsubstr(String str, int low, int high) {
		for (int i = low; i < high; ++i) {
			System.out.print(str.charAt(i));
		}
	}

	public int longpal(String str) {
		int n = str.length();
		int maxlen = 1, start = 0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = i; j < str.length(); j++) {
				int flag = 1;
				for (int k = 0; k < (j - i + 1) / 2; k++)
					if (str.charAt(i + k) != str.charAt(j - k))
						flag = 0;

				if (flag != 0 && (j - i + 1) > maxlen) {
					start = i;
					maxlen = j - i + 1;
				}
			}
		}
		
		printsubstr(str, start, start + maxlen - 1);
		return maxlen;
	}

}

public class Palindrome {

	public static void main(String[] args) {
		Consumer ic= (o)->{
		Palindrome pal = new Palindrome();
		pal.longpal((String) o);
		};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String n=sc.nextLine();
		ic.accept(n);
	}

}
