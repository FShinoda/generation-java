package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExerciseOneQueue {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		int option = -1;
		
		
		do {
			System.out.println("\n" + "*".repeat(50) + "\n");
			System.out.println("\t1 - Add Customer on queue"
					+ "\n\t2 - List all Customers"
					+ "\n\t3 - Remove Customer from queue"
					+ "\n\t0 - Exit");
			System.out.println("\n" + "*".repeat(50));
			System.out.print("Enter desired option: ");
			option = sc.nextInt();
			
			switch(option) {
				case 1:
					System.out.print("Type customer name: ");
					sc.nextLine();
					String customer = sc.nextLine();
					queue.add(customer);
					System.out.println("\nQueue:");
					showQueue(queue);
					System.out.println("\nCustomer added!");
					break;
				case 2:
					System.out.println("\nQueue:");
					showQueue(queue);
					break;
				case 3:
					queue.poll();
					System.out.println("\nQueue:");
					showQueue(queue);
					System.out.println("\nThe first customer was called and they exit the queue.");
					break;
				case 0:
					System.out.println("\nExiting program...");
					break;
				default:
					System.out.println("\n[!] Invalid Option");
					break;
				
			}
		} while (option != 0);
		
		sc.close();
	}
	
	public static void showQueue(Queue<String> queue) {
		Iterator<String> iQueue = queue.iterator();
		
		while(iQueue.hasNext()) {
			System.out.println(iQueue.next());
		}
	}

}
