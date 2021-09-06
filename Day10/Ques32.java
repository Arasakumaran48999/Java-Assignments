package Day10;

import java.util.HashMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class Ques32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  TreeMap<Integer,String> tm= new TreeMap<Integer,String>(); 
		  SortedMap < Integer, String > sub_tree_map = new TreeMap < Integer, String > ();

		  
		  tm.put(4,"Arasa");
		  tm.put(3,"kumaran");
		  tm.put(2,"Als");
		  tm.put(35,"hari");
		  tm.put(10,"robin");
		  System.out.println(tm);
		  sub_tree_map = tm.subMap(20, 40);
		  System.out.println(sub_tree_map);
	}

}
