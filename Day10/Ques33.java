package Day10;

import java.util.*;  

public class Ques33{  
 public static void main(String args[]){  
  TreeMap<Integer,String> treemap=new TreeMap<Integer,String>();
  Scanner sc=new Scanner(System.in);
  treemap.put(1, "Arasa");
  treemap.put(2, "kumaran");
  treemap.put(3, "als");
  treemap.put(4, "ak");
  treemap.put(5, "raji");
  System.out.println ("Enter the range:");
  int n=sc.nextInt();

  System.out.println(treemap.tailMap(n));
  }
}