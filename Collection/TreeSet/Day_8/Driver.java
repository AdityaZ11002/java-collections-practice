package Day_8;

import java.util.TreeSet;

// How does it maintain uniqueness? => Because treeset understand that if it is a Zero then ignore

class Employee implements Comparable<Employee> {

	int salary;
	String name;

	public Employee(int _salary, String _name) {
		super();
		this.salary = _salary;
		this.name = _name;
	}

	@Override
	public int compareTo(Employee e2) { // This will return -ve , Zero Or +ve
//		return (this.salary - e2.salary); // it is used to comapare  salary object with all other  salary object
//		return (e2.salary - this.salary); // for reverse comparision 

		// if we want to compare with name object
		return (e2.name.compareTo(this.name));

	}

}

public class Driver {

	public static void main(String[] args) {

		Employee e1 = new Employee(120000, "Om");
		Employee e2 = new Employee(900000, "Amit");
		Employee e3 = new Employee(230000, "ajhar");
		Employee e4 = new Employee(200000, "Sowam");

		TreeSet<Employee> ts = new TreeSet<Employee>(); // we will do sorting based on salary and name

		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);

		System.out.println(ts);

		for (Employee e : ts) {
			System.out.println(e.name + " and " + e.salary);
		}

	}

}