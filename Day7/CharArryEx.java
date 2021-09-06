package Day7;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CharArryEx {

	public static void main(String[] args) {
		char a[]= {'k','u','m','a','r'};
		CharArrayReader car=new CharArrayReader(a);
		int c;
		try {
			while((c= car.read())!=-1) {
				System.out.print((char)c);
			}
			car.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CharArrayWriter caw=new CharArrayWriter();
		try {
			caw.write(a);
			FileWriter f1=new FileWriter("C:\\Users\\Arasakumaran\\Desktop\\example2.txt");
			caw.writeTo(f1);
			f1.close();
			caw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
