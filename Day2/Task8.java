package arasakumaran;
import java.util.*;
import java.io.*;
public class Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int row=sc.nextInt();
		System.out.println("Enter the number of colums:");
		int col=sc.nextInt();
		int a[][]=new int[row][col];
		String s[][]=new String[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(a[i][j]%2==0) {
					s[i][j]="even";
				}else {
					s[i][j]="odd";
				}
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(a[i][j]+" ");
				System.out.print(s[i][j]+" ");
			}
			System.out.println();
		}
	}

}
