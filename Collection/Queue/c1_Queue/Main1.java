package c1_Queue;
import java.util.*;

public class Main1 {
	public static void main(String[] args) {
		
		Queue q=new LinkedList();
		
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		
		System.out.println(q); // [10, 20, 30, 40, 50]
		
		System.out.println(q.remove()); // 10
		
		System.out.println(q); // [20, 30, 40, 50]
		
		System.out.println(q.remove()); // 20
		
		System.out.println(q); // [30, 40, 50]
		
		System.out.println(q.poll()); // 30
		
		System.out.println(q); // [40, 50]
		
		System.out.println(q.peek()); // 40
		
		System.out.println(q); // [40, 50]
		
	}

}
