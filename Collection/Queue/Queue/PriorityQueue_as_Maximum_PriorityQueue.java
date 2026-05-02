package Queue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityQueue_as_Maximum_PriorityQueue {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of initial tasks (n)
        System.out.println("Enter the queue Size: ");
        int n = sc.nextInt();

        // Create a PriorityQueue to store task priorities as a max-priority queue
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());  // Comparator; Reverses natural ordering; Converts min heap → max heap

        // Read and add n task priorities to the PriorityQueue
        System.out.println("Enetr the Elements: ");
        for (int i = 0; i < n; i++) {
            pq.add(sc.nextInt());
        }

        // Read the new task priority to insert
        System.out.println("Enter the new insert element: ");
        int newTask = sc.nextInt();

        // TODO: Add the new task priority to the PriorityQueue
        pq.add(newTask);

        // Remove the highest-priority task from the queue
        pq.poll();

        // Print the updated queue of task priorities
        
// // BY THIS IS ALSO POSSIBLE BUT IT WAS LITTLE BIT CONFUSING
//        System.out.println("Updated Priority Queue of Task Priorities:");
//        while (!pq.isEmpty()) {
//            System.out.print(pq.poll() + " ");
//        }
        
// // BY THIS IS ALSO POSSIBLE AND IT IS ESSAY TO UNDERSTAND
        // one more alternative way
        System.out.println("Updated Priority Queue of Task Priorities:");
        for (int i=0;i<=n-1;i++) {
        	System.out.print(pq.poll() + " ");
        }
        
        
// // SOME TIME IT NOT WORK THIS ENHANCE FOR LOOP SO THEN GO WITH NORMAL FOR LOOP     
//        // one more alternative way 
//        System.out.println("Updated Priority Queue of Task Priorities:");
//        for (Integer x:pq) {
//        	System.out.print(x + " ");
//        }

        sc.close();
    }

}
