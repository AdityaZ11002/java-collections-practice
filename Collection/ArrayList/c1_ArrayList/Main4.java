package c1_ArrayList;
import java.util.ArrayList;
import java.util.Iterator;

public class Main4 {
	public static void main(String[] args) {	
		ArrayList al = new ArrayList();
		
		al.add(100);
		al.add(50);
		al.add(150);
		al.add(25);
		al.add(125);
		al.add(75);
		al.add(175);
		al.add(150);
		
		
		System.out.println("Using iterator Method:");
		Iterator itr = al.iterator();
		
		System.out.print("[");
		while(itr.hasNext()) {
			System.out.print(itr.next());
			if(itr.hasNext()) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
		
		
//		while(itr.hasNext()) { // Check wheather next element present or not
//			System.out.print(itr.next() + " ");
//		}
		
		System.out.println();
		
		System.out.println("Using enhance for loop:");
		for( Object x : al) {
			System.out.print(x + " ");
		}
		
		System.out.println();
		
		System.out.println("Using for loop:");
		for(int i=0;i<=al.size()-1;i++) {
			System.out.print(al.get(i) + " ");
		}
		
		
		
	}
}
