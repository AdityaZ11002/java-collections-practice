package Day_6;

import java.util.HashSet;



class Employee {

	String name;

	public Employee(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		Employee e = (Employee) obj;
		return this.name.equals(e.name);
	}

	@Override
	public int hashCode() {
		return this.name.hashCode();
	}
}

public class Driver {

	public static void main(String[] args) {

		// String Example
		HashSet<String> cities = new HashSet<String>();

		cities.add("Bengalore");
		cities.add("HYD");
		cities.add("Bengalore");

		System.out.println("Cities Size : " + cities.size());

		// Employee Example
		HashSet<Employee> emps = new HashSet<Employee>();

		Employee e1 = new Employee("Amit");
		Employee e2 = new Employee("Ram");
		Employee e3 = new Employee("Om");
		Employee e4 = new Employee("Amit");

		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
		emps.add(e4);

		System.out.println("Employees Size : " + emps.size()); // 3

		System.out.println(e1.hashCode() + " " + e4.hashCode() + " and e1 and e4 are same ? " + e1.equals(e4));
	}
}









//class Employee {
//
//	String name;
//
//	public Employee(String name) {
//		this.name = name;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		Employee e = (Employee) obj;
//		return this.name.equals(e.name);
//	}
//
//	@Override
//	public int hashCode() {
//		return this.name.hashCode();
//	}
//
//}
//
//public class Driver {
//
//	public static void main(String[] args) {
//
//		HashSet<String> cities = new HashSet<String>();
//
//		cities.add("Bengalore");
//		cities.add("HYD");
//
//		System.out.println(cities.size());
//
//		System.out.println(cities.size());
//
//		HashSet<Employee> employee = new HashSet<Employee>();
//
//		employee.add(new Employee("Amit"));
//		employee.add(new Employee("Ram"));
//		employee.add(new Employee("Om"));
//		employee.add(new Employee("Amit"));
//
//		System.out.println(employee.size());
//
//	}
//
//}
