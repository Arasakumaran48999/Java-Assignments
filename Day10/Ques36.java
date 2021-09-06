package Day10;

import java.util.*;  

public class Ques36{  
 public static void main(String args[]){  
  TreeMap<Integer,String> treemap=new TreeMap<Integer,String>();
  Scanner sc=new Scanner(System.in);
  treemap.put(10, "Arasa");
  treemap.put(20, "kumaran");
  treemap.put(30, "als");
  treemap.put(40, "ak");
  treemap.put(50, "raji");
  System.out.println(treemap);
  System.out.println("Checking the entry for 10: " + treemap.lowerKey(10));
  System.out.println("Checking the entry for 20: " + treemap.lowerKey(20));
  System.out.println("Checking the entry for 70: " + treemap.lowerKey(70));

  }
}