package Day10;

import java.util.*;  

public class Ques35{  
 public static void main(String args[]){  
  TreeMap<Integer,String> treemap=new TreeMap<Integer,String>();
  Scanner sc=new Scanner(System.in);
  treemap.put(10, "Arasa");
  treemap.put(20, "kumaran");
  treemap.put(30, "als");
  treemap.put(40, "ak");
  treemap.put(50, "raji");
  System.out.println(treemap);
  System.out.println("greater than or equal to 20: " + treemap.ceilingEntry(20));
  System.out.println("greater than or equal to 40: " + treemap.ceilingEntry(40));
  System.out.println("greater than or equal to 50: " + treemap.ceilingEntry(50));

  }
}