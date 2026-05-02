package c1_Queue;

import java.util.PriorityQueue;

public class Main4 {

	public static void main(String[] args) {
		
		PriorityQueue pq = new PriorityQueue();
		
		pq.add(100);
		pq.add(25);
		pq.add(75);
		pq.add(50);
		pq.add(150);
		pq.add(125);
		pq.add(175);
		pq.add(10);
		
		System.out.println(pq);
		
		while(!pq.isEmpty()) {
		    System.out.print(pq.poll() + " ");
		}

		

	}

}
