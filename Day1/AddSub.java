package Day1;
import java.io.*;

class AddSub
{
	static int b=5;
	public static void main(String arg[])
	{
		AddSub k=new AddSub();
		int a=10;
		Add(a,k.b);
		subtract(a,k.b);
	}
	static void Add(int x, int y)
	{
		while (y != 0)
		{
			int carry = x & y;
			x = x ^ y;
			y = carry << 1;
		}
		System.out.println(x);
	}
	static void subtract(int x, int y)
    {
     while (y != 0)
    {
        int borrow = (~x) & y;
        x = x ^ y;
        y = borrow << 1;
    }
     System.out.println(x);
     
}
	
}

