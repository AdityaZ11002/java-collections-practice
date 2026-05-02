package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Retrieve_Element_Using_GetMethod {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Size of Element: ");
		int n = scan.nextInt();
		
		ArrayList al = new ArrayList();
		
		for(int i=0;i<=n-1;i++) {
			al.add(scan.nextInt());
		}
		
		
		System.out.println("Enter the index no. : ");
		int index = scan.nextInt();
		System.out.println(al.get(index));
		
		scan.close();
	}

}
