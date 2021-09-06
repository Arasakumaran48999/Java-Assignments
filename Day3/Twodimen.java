package Day3;
import java.util.*;
import java.io.*;
public class Twodimen {
	
	static int reversDigits(int num)
    {
        int rev_num = 0;
        while (num > 0) {
            rev_num = rev_num * 10 + num % 10;
            num = num / 10;
        }
        return rev_num;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int row=sc.nextInt();
		System.out.println("Enter the number of colums:");
		int col=sc.nextInt();
		int a[][]=new int[row][col];
		int s[][]=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				s[i][j]=reversDigits(a[i][j]);
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
