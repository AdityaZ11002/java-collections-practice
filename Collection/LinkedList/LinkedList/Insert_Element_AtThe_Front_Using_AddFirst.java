package LinkedList;
import java.util.LinkedList;
import java.util.Scanner;

public class Insert_Element_AtThe_Front_Using_AddFirst {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		LinkedList<String> task = new LinkedList<>();
		
		System.out.println("Enter Size of Element: ");
		int n = scan.nextInt();
		scan.nextLine(); 
		
		System.out.println("Enter the Elements: ");
		for(int i=0;i<=n-1;i++) {
			String element = scan.nextLine();
			task.addFirst(element);
		}
		
		System.out.println(task.size());
		
		System.out.println("Task: ");
		for(String x:task) {
			System.out.println(x);
		}

	}

}
