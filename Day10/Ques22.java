package Day10;

import java.util.PriorityQueue;
@SuppressWarnings("unchecked")
public class Ques22 {

	public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue();
		
		pq.add(100);
		pq.add(200);
		pq.add(300);
		pq.add(400);
		pq.add(500);
		
		int first=(int) pq.peek();
		System.out.println(first);
		System.out.println(pq);
	}

}
