package Day1;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {

		// Task --> Create an array list and store the elements

		// The default capacity of an ArrayList is 10, and when it becomes full, its capacity increases by 50% of the current capacity.
		ArrayList<String> studentList = new ArrayList<String>();
		// Creates an ArrayList object that can store String objects.

		studentList.add("chaitanya"); // Added String object to the list
		studentList.add("lokesh");
		studentList.add("rohit");
		studentList.add("lokesh");
		studentList.add("Nadeem"); // Total 4 string objects have been added to the list.
		studentList.add("chaitanya"); // Added String object to the list
		studentList.add("lokesh");
		studentList.add("rohit");
		studentList.add("lokesh");
		studentList.add("Rahul");
		studentList.add("Nadeem");

		// System.out.println(studentList.get(3));
		// Index based --> apply some operation..

		// find the names which start with R
		for (int i = 0; i < studentList.size(); i++) {
			String currentElement = studentList.get(i);
			if (currentElement.toUpperCase().startsWith("R")) {
				System.out.println(currentElement);
			}
		}

	}

}
