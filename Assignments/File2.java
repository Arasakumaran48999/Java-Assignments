package Assignments;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File2 {

	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("C:\\Users\\Arasakumaran\\Downloads\\Assignments.txt");    
        int i;    
        FileWriter fw=new FileWriter("C:\\Users\\Arasakumaran\\Downloads\\example.txt");    
        
        try {
        	while((i=fr.read())!=-1)    
        	fw.write((char)i);    
            fw.close(); 
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}    

	}

}
