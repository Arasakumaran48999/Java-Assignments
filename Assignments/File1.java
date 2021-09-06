package Assignments;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class File1 {

	public static void main(String[] args) throws FileNotFoundException {
		FileReader fr=new FileReader("C:\\Users\\Arasakumaran\\Downloads\\Assignments.txt");    
        int i;    
        String input="";
        try {
        	while((i=fr.read())!=-1)    
            input=input+(char)i;    
			fr.close();
			//System.out.println(input);
			char a[]=input.toCharArray();
			for(int i1=0;i1<input.length();i1++) {					
				int count=1;
				for(int j=i1+1;j<input.length();j++) {
					if((a[i1]==a[j])&&(a[i1]!='0')) {
						count++;
						a[j]='0';
						//System.out.println("hi");
					}
				}

				if((count>1)&&(a[i1]!='0')){
					System.out.println("The letter "+a[i1]+" is duplicated "+count+" times");
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}    

	}

}
