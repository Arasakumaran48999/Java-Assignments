package Day7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Fileex {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		try {
			 fis=new FileInputStream("C:\\Users\\Arasakumaran\\eclipse-workspace\\arasa\\src\\Day6\\Fileex.java");
			int c;
			while((c= fis.read())!=-1) {
				System.out.print((char)c);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			fis.close();
		}

	}

}
