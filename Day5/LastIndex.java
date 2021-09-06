package Day5;
import java.util.Scanner;
public class LastIndex {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String input = sc.nextLine();
		System.out.println("Enter the word to search:");
		String search = sc.nextLine();
	    System.out.println(input.lastIndexOf(search));
	}

}
