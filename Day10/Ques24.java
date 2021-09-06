package Day10;

import java.util.PriorityQueue;

public class Ques24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> pq= new PriorityQueue<String>();
		  
		pq.add("Arasa");
		pq.add("kumaran");
		pq.add("als");
		pq.add("hari");
		pq.add("janani");
        System.out.println(pq);
        Object[] arr = pq.toArray();
  
        System.out.println("The array is:");
        for (int j = 0; j < arr.length; j++)
            System.out.println(arr[j]);
	}

}
