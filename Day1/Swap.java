package Day1;
import java.io.*;
 
class Swap {
	static int y = 5;
    public static void main(String a[])
    {
    	Swap s=new Swap();
        int x = 10;
        
        x = x + s.y;
        s.y = x - s.y;
        x = x - s.y;
        System.out.println("After swaping:"
                           + " x = " + x + ", y = " + s.y);
    }
}
 