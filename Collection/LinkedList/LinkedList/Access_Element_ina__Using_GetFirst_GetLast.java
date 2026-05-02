package LinkedList;
import java.util.LinkedList;
import java.util.Scanner;

public class Access_Element_ina__Using_GetFirst_GetLast {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        LinkedList<String> attendees = new LinkedList<>();


        System.out.println("Enter the size of Element: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline


        for (int i = 0; i < n; i++) {
            attendees.addLast(sc.nextLine());
        }

        
        String first = attendees.getFirst();
        String last = attendees.getLast();


        System.out.println("First attendee: " + first);
        System.out.println("Last attendee: " + last);
        System.out.println("Number of attendees: " + attendees.size());

        System.out.println("Attendees:");
        for (String name : attendees) {
            System.out.println(name);
        }

        sc.close();
    }
}
