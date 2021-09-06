package Day10;

import java.util.*;

public class Ques26 {
	
  public static void main(String[] args) {
  
	  PriorityQueue<Integer> pq = new PriorityQueue<>(5, Collections.reverseOrder());
      
	  pq.add(92);
	  pq.add(12);
	  pq.add(32);
	  pq.add(27);
	  pq.add(11);
	  System.out.println(pq);
	  System.out.print("\nMaximum Priority Queue: ");
	  Integer val = null;
	  while( (val = pq.poll()) != null) {
		  System.out.print(val+"  ");
      }
   	  	System.out.print("\n");
     }
  }