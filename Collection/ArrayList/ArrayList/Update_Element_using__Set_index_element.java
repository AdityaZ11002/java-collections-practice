package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class Update_Element_using__Set_index_element {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Array Size : ");
		int n = scan.nextInt();
		
		ArrayList al = new ArrayList();
		
		System.out.println("Enter the Element: ");
		for(int i=0;i<=n-1;i++) {
			al.add(scan.nextInt());
		}
		
		System.out.println("Enter the index no: ");
		int index = scan.nextInt();
		System.out.println("Enter the New Value: ");
		int newValue =scan.nextInt();
		al.set(index, newValue);
		
//		System.out.println(al);
		
		System.out.println("Update ArrayList: ");
		for( Object x : al) {
			System.out.print(x + " ");
		}

	}

}
