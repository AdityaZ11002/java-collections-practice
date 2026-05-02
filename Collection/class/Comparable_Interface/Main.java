package Comparable_Interface;

import java.util.*;


public class Main {
	public static void main(String[] args) {
		
		
		Student s1 = new Student(11,"Amith",80.5);
		Student s2 = new Student(13,"Rohit",80.5);
		Student s3 = new Student(12,"Mohit",80.5);
		
		ArrayList al  = new ArrayList();
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		
		System.out.println(al);
		
		Collections.sort(al);
		System.out.println(al);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		ArrayList al = new ArrayList();
//		
//		al.add(10);
//		al.add(40);
//		al.add(30);
//		al.add(20);
//		al.add(50);
//		
//		System.out.println(al);
//		
//		
//		Collections.sort(al);
//		System.out.println(al);
		
	}

}
