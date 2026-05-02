package c1_Queue;
import java.util.ArrayDeque;

public class Main2 {
	public static void main(String[] args) {
		
		ArrayDeque ad = new ArrayDeque();
		
		ad.add(10);
		ad.add(20);
		ad.add(30);		
		System.out.println(ad); // [10, 20, 30]
		
		ad.addFirst(99);
		System.out.println(ad); // [99, 10, 20, 30]
		
		ad.addLast(77);
		System.out.println(ad); // [99, 10, 20, 30, 77]
			
		System.out.println(ad.removeFirst()); // 99
		System.out.println(ad); // [10, 20, 30, 77]
		
		System.out.println(ad.removeLast()); // 77
		System.out.println(ad); // [10, 20, 30]
		
		System.out.println(ad.pollFirst());  // 10
		System.out.println(ad);  // [20, 30]
		
		ad.addFirst(33);
		ad.addFirst(44);
		System.out.println(ad); // [44, 33, 20, 30]
		
		System.out.println(ad.pollLast()); // 30
		System.out.println(ad); // [44, 33, 20]
		
		System.out.println(ad.peekFirst()); // 44
		System.out.println(ad); // [44, 33, 20]
		
		System.out.println(ad.peekLast()); // 20
		System.out.println(ad); // [44, 33, 20]
		
		
		
		
		
	}

}
