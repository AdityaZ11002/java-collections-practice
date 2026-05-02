package c1_ArrayList;
import java.util.ArrayList;

public class Main1 {
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println(al); // [10, 20, 30, 40, 50]
		
		System.out.println();
		
		// in this method We can also add String 
		al.add("Java");
		al.add("Sql");
		al.add(100.00);
		al.add(true);
		al.add("K");
		System.out.println(al); // [10, 20, 30, 40, 50, ArrayList, Java, 100.0, true, a]
		
		System.out.println();
		
		System.out.println(al.size()); // 10
		System.out.println(al.contains(50)); // true
		System.out.println(al.get(3)); // 40
		System.out.println(al.getFirst()); // 10
		System.out.println(al.getLast()); // a
		System.out.println(al.indexOf(20)); // 2
		System.out.println(al.isEmpty()); // false
		
		System.out.println();
		
		System.out.println(al); // [10, 20, 30, 40, 50, ArrayList, Java, 100.0, true, a]
		al.remove(0);
		System.out.println(al); // [20, 30, 40, 50, ArrayList, Java, 100.0, true, a]
		al.add(20); 
		System.out.println(al); // [20, 30, 40, 50, ArrayList, Java, 100.0, true, a, 20]
		System.out.println(al.lastIndexOf(20)); // 9
		
		al.removeFirst();
		System.out.println(al); // [30, 40, 50, ArrayList, Java, 100.0, true, a, 20]
		
		al.removeLast();
		System.out.println(al); // [30, 40, 50, ArrayList, Java, 100.0, true, a]
		
		al.set(3, "HTML");
		System.out.println(al); // [30, 40, 50, HTML, Java, 100.0, true, a]
		
		al.add(2, 99);
		System.out.println(al); // [30, 40, 99, 50, HTML, Java, 100.0, true, a]
		
		
		
		ArrayList al2 = new ArrayList();
		
		al2.add(100);
		al2.add(300);
		al2.add(200);
		
		System.out.println(al2); // [100, 300, 200]
		
		
		al.addAll(al2);
		System.out.println(al); // [30, 40, 99, 50, HTML, Java, 100.0, true, a, 100, 300, 200]
		
		
		
		
		
		
		
	}
}
