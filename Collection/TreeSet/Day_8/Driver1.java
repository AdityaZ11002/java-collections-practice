package Day_8;

import java.util.TreeSet;

public class Driver1 {
	public static void main(String[] args) {
		Person p1 = new Person("rohit", "bhishikar");
		Person p2 = new Person("shubham", "mahajan");
		Person p3 = new Person("shahil", "ansari");

		TreeSet<Person> ts = new TreeSet<Person>(new FirstNameComparator());

		ts.add(p1);
		ts.add(p2);
		ts.add(p3);

		for (Person p : ts) {
			System.out.println(p.firstName + " and " + p.lastName);
		}
	}
}
