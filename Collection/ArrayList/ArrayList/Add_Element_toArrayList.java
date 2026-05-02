package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class Add_Element_toArrayList {
	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		
		ArrayList al = new ArrayList();
		
		System.out.println("Enter the Size of Element: ");
		int n = scan.nextInt();
		
		for(int i=0;i<=n-1;i++) {
			int element = scan.nextInt();
			al.add(element);
		}
				
		System.out.println("Size: " + al.size());
		
		// Enhanced for-each loop.
		System.out.println("Elememt: ");
		for (Object x:al) {
			System.out.print(x + " ");
		}
		
			
		scan.close();
	}

}
