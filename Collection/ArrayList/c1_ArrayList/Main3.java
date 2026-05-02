package c1_ArrayList;

import java.util.ArrayList;

public class Main3 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add("Java");
		al.add("Sql");
		al.add(100.00);
		al.add(true);
		al.add("K");
		
		for(int i=0;i<=al.size()-1;i++) {
			System.out.print(al.get(i) + " ");
		}
		
		System.out.println();
		
		// By using Enhanced for loop
		for(Object x : al) {
			System.out.print(x + " ");
		}
		
		
		

	}

}
