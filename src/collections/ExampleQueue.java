package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExampleQueue {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		
		for(int i=0; i < 10; i++) {
			queue.add(i);
		}
		
		System.out.println("\n Queue elements: " + queue);
		System.out.println("\n Queue remove element: " + queue.remove());
		System.out.println("\n Queue elements: " + queue);
		System.out.println("\n Queue add element: " + queue.add(11));
		System.out.println("\n Queue 1st element: " + queue.peek());
		System.out.println("\n Queue size: " + queue.size());
		System.out.println("\n Queue contains 5?: " + queue.contains(5));
		System.out.println("\n Queue show and delete 1st element (HEAD): " + queue.poll());
		
		System.out.println("\n Queue interate:");
		Iterator<Integer> iQueue = queue.iterator();
		
		while(iQueue.hasNext()) {
			System.out.println(iQueue.next());
		}
		
		System.out.println("\n Clear queue: ");
		queue.clear();
		
		System.out.println("\n Is queue clear? " + queue.isEmpty());
	}
}
