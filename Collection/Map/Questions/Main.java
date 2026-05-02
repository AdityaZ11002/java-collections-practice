//A school wants to organize student information efficiently.
//Each class (Class A, Class B, and Class C) contains three students. 
//Every student has a name and a roll.
//
//Your task is to:
//Create a Student class with appropriate fields (roll (int) and name (String)).
//Create three ArrayList<Student> objects, one for each class.
//Add three student objects to each list.
//Store these lists inside a HashMap<String, List<Student>>, where
//the key is the class name (e.g., "Class A", "Class B", "Class C")
//the value is the list of students belonging to that class
//Write code to:
//Print all students of Class B
//Print all classes and their students details



package Questions;
import java.util.*;


public class Main {
	public static void main(String[] args) {
	
		// Create ArrayList<Student> objects for each class
        ArrayList<Student> classA = new ArrayList<>();
        ArrayList<Student> classB = new ArrayList<>();
        ArrayList<Student> classC = new ArrayList<>();
        
        Student s1 = new Student(1,"Ajay");
        Student s2 = new Student(2,"Amith");
        Student s3 = new Student(3,"Balu");
        
        classA.add(s1);
        classB.add(s2);
        classC.add(s3);
        
        Student s4 = new Student(4,"Sooraj");
        Student s5 = new Student(5,"mohith");
        Student s6 = new Student(6,"Rohan");
        
        classA.add(s4);
        classB.add(s5);
        classC.add(s6);
        
        Student s7 = new Student(7,"Sooraj");
        Student s8 = new Student(8,"mohith");
        Student s9 = new Student(9,"Rohan");
        
        classA.add(s7);
        classB.add(s8);
        classC.add(s9);
        
        
        HashMap<String, List<Student>> map = new HashMap<String, List<Student>>();
        
        map.put("classA", classA);
        map.put("classB", classB);
        map.put("classC", classC);
        
        // fetch student details of class B  
        List<Student> classBStudents = map.get("classB");
        System.out.println(classBStudents);
        
        System.out.println();
        
        // fetch using for each loop
        for(Student st : classBStudents) {
        	System.out.println(st);
        }
        
        System.out.println();
        
        System.out.println("accessing student details of all the classes");
        for(String key : map.keySet()) {
        	for(Student student:map.get(key)) {
        		System.out.println(student);
        	}
        }
        
        
	}

}




                      //OR


//public class Main {
//    public static void main(String[] args) {
//
//        // Create ArrayList<Student> objects for each class
//        ArrayList<Student> classA = new ArrayList<>();
//        ArrayList<Student> classB = new ArrayList<>();
//        ArrayList<Student> classC = new ArrayList<>();
//
//        // Add three students to Class A
//        classA.add(new Student(1, "Ajay"));
//        classA.add(new Student(2, "Amith"));
//        classA.add(new Student(3, "Balu"));
//
//        // Add three students to Class B
//        classB.add(new Student(4, "Sooraj"));
//        classB.add(new Student(5, "Mohith"));
//        classB.add(new Student(6, "Rohan"));
//
//        // Add three students to Class C
//        classC.add(new Student(7, "Kiran"));
//        classC.add(new Student(8, "Sneha"));
//        classC.add(new Student(9, "Vikram"));
//
//        // Store lists inside a HashMap
//        HashMap<String, List<Student>> map = new HashMap<>();
//        map.put("Class A", classA);
//        map.put("Class B", classB);
//        map.put("Class C", classC);
//
//        // Print all students of Class B
//        System.out.println("Students of Class B:");
//        for (Student student : map.get("Class B")) {
//            System.out.println(student);
//        }
//
//        System.out.println();
//
//        // Print all classes and their student details
//        System.out.println("All Classes and Their Students:");
//        for (Map.Entry<String, List<Student>> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + ":");
//            for (Student student : entry.getValue()) {
//                System.out.println("  " + student);
//            }
//            System.out.println();
//        }
//    }
//}



