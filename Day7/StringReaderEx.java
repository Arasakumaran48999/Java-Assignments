package Day7;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class StringReaderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String clg="Mepco schlenk engineering college";
		StringReader sr=new StringReader(clg);
		int c;
		try {
			while((c= sr.read())!=-1) {
				System.out.print((char)c);
			}
			sr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//StringWriter sw=new StringWriter(clg);
		

	}

}
