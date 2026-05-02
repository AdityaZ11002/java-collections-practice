package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Insert_Element_using__add_index_element {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Array Size : ");
		int n = scan.nextInt();
		
		ArrayList al = new ArrayList();
		
		System.out.println("Enter the String: ");
		for(int i=0;i<=n-1;i++) {
			al.add(scan.next());
		}
		
		System.out.println("Enter the index no: ");
		int index = scan.nextInt();
		System.out.println("Enter the New String: ");
		String newString =scan.next();
		al.add(index, newString);  // used to insert element at a Specific Position using add(index, element)
		
//		System.out.println(al);
		
		System.out.println("Update ArrayList: ");
		for( Object x : al) {
			System.out.print(x + " ");
		}

	}

}
