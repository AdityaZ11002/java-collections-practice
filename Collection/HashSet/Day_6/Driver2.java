package Day_6;

import java.util.HashSet;
import java.util.Set;

// treeify introduce in version 8+


class Student {

    String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return 12344321; // forcing Same hashCode for all objects
    }
}

public class Driver2 {

    public static void main(String[] args) {

        Set<Student> students = new HashSet<Student>(16);

        Student s1 = new Student("Emp1");
        Student s2 = new Student("Emp2");
        Student s3 = new Student("Emp3");
        Student s4 = new Student("Emp4");
        Student s5 = new Student("Emp5");
        Student s6 = new Student("Emp6");
        Student s7 = new Student("Emp7");
        

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);
        students.add(s7);
        

        System.out.println("Size = " + students.size());
        
        
        Student s8 = new Student("Emp8");
        Student s9 = new Student("Emp9");
        Student s10 = new Student("Emp10");
        
        students.add(s8);
        students.add(s9);
        students.add(s10);
        
        System.out.println("Size = " + students.size());
        
        
        
        
        
        
        
    }
}