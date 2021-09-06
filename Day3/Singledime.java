package Day3;
import java.io.*;
import java.util.*;
public class Singledime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter 5 values to check odd or even:");
		for(int i=0;i<5;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<5;i++) {
			if(a[i]%2==0) {
				System.out.println("The number "+a[i]+" is even");
			}else {
				System.out.println("The number "+a[i]+" is odd");
			}
		}
	}

}
