package Comparable_Interface;

public class Student implements Comparable<Student> {
	
	int roll;
	String name;
	double marks;
	
	Student(int roll,String name,double marks){
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	
	@Override
	
	public String toString() {
		return roll + " " + name + " ";
	}

//	@Override
//	public int compareTo(Student obj) {
//		if (roll > obj.roll) {
//			return 1;
//		} else if (roll < obj.roll) {
//			return -1;
//		} else {
//			return 0;
//		}
//	}
	 
	
//	another alternate opption
//	@Override
//	public int compareTo(Student obj) {
//		return this.roll - obj.roll;
//	}
	
//	public int compareTo(Student obj) {
//		return (int)(this.marks - obj.marks);
//    }
	
	
	public int compareTo(Student obj) {
		return this.name.compareTo(obj.name);
}

}
