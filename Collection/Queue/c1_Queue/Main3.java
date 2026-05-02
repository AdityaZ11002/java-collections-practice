package c1_Queue;

import java.util.ArrayDeque;

public class Main3 {

	public static void main(String[] args) {
		
		ArrayDeque ad = new ArrayDeque();
		
		ad.push(10);
		ad.push(20);
		ad.push(30);
		ad.push(40);
		ad.push(50);
		
		System.out.println(ad); // [50, 40, 30, 20, 10]
		
		System.out.println(ad.pop()); // 50
		
		System.out.println(ad); // [40, 30, 20, 10]
		
		System.out.println(ad.pop()); // 40
		
		System.out.println(ad.pop()); // 30
		
		System.out.println(ad); // [20, 10]
	}

}
