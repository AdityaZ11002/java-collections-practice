package HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MainStudent {

	public static void main(String[] args) {
		
		Student s1 = new Student(11,"Amit",87.5);
		Student s2 = new Student(12,"Sumit",65.5);
		Student s3 = new Student(13,"Rohit",87.9);
		
		HashMap hm = new HashMap();
		
		hm.put(1, s1);
		hm.put(2, s2);
		hm.put(3, s3);
		
		System.out.println(hm);
		
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("Key are: ");
		Set res1 = hm.keySet();
		Iterator itr1 = res1.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		
		System.out.println();
		
		
		
		
		
		
		
		System.out.println("Value are: ");
		Collection res2 = hm.values();
		Iterator itr2 = res2.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
		
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("Key and Value are: ");
	    Set res3 = hm.entrySet();
	    Iterator itr3 = res3.iterator();
	    while(itr3.hasNext()) {
	    	System.out.println(itr3.next());
	    }
	    
		
		
		
		

	}

}
