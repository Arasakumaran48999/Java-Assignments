package Day10;

import java.util.PriorityQueue;

public class Ques25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> pq= new PriorityQueue<String>();
		  
		pq.add("Arasa");
		pq.add("kumaran");
		pq.add("als");
		pq.add("hari");
		pq.add("janani");
        System.out.println(pq);
        String p=pq.toString();	//merthod1
        System.out.println(p);
        
        String s="";
        Object[] arr = pq.toArray();
        for (int j = 0; j < arr.length; j++)	//method2
            s+=arr[j]+" ";
        System.out.println(s);
	}

}
