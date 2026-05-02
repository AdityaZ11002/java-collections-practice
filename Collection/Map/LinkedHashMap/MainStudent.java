package LinkedHashMap;

import java.util.*;

public class MainStudent {

	public static void main(String[] args) {
		
		Student s1 = new Student(11,"Amit",87.5);
		Student s2 = new Student(12,"Sumit",65.5);
		Student s3 = new Student(13,"Rohit",87.9);
		
		LinkedHashMap hm = new LinkedHashMap();
		
		hm.put(1, s1);
		hm.put(2, s2);
		hm.put(3, s3);
		
		System.out.println(hm);
		
		

	}

}
