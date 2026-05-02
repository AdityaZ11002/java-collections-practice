//What will be the output of the following Java program?
//Explain the role of null assignment and System.gc() in this context.

package Question2;

public class Main {

	public static void main(String[] args) {
		 String s = "Hello world";
		 System.out.println(s);
		 
		 s = null;
		 
		 System.gc(); // gc = garbage collector
		 System.out.println(s);

	}

}
