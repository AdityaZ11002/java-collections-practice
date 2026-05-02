package Queue;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Retrieve_the_first_element_Using_PriorityQueue {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of initial support tickets (n)
        System.out.println("Enter the queue Size: ");
        int n = sc.nextInt();

        // Create a PriorityQueue to store ticket priorities . Lower number = higher priority (default min-heap)
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Read and add n ticket priorities to the PriorityQueue
        System.out.println("Enetr the Elements: ");
        for (int i = 0; i < n; i++) {
            pq.add(sc.nextInt());
        }

        // Read the new ticket priority to insert
        System.out.println("Enter the new insert element: ");
        int newTicket = sc.nextInt();

        // Add the new ticket priority to the PriorityQueue
        pq.add(newTicket);

        // Retrieve the first element from the PriorityQueue
        int firstElement = pq.peek();

        // Print the first element
        System.out.println("First element in the Priority Queue: " + firstElement);

        sc.close();
    }

}
