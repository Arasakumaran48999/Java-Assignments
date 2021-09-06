package Day7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferCharEx {

	public static void main(String[] args) throws IOException {
		try {
			FileReader fr=new FileReader("C:\\Users\\Arasakumaran\\Desktop\\example.txt");
			BufferedReader br=new BufferedReader(fr);  
			int c;
			while((c= br.read())!=-1) {
				System.out.print((char)c);
			}
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FileWriter fw=new FileWriter("C:\\Users\\Arasakumaran\\Desktop\\example2.txt"); 
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("Arasakumaran");
		bw.close();

	}

}
