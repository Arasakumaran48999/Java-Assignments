package Day10;

import java.util.PriorityQueue;
@SuppressWarnings("unchecked")
public class Ques23 {

	public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue();
		
		pq.add(100);
		pq.add(200);
		pq.add(300);
		pq.add(400);
		pq.add(500);
		
		
		System.out.println(pq);
		int first=(int) pq.poll();
		System.out.println(first);
		System.out.println(pq);
	}

}
