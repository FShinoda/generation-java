package collections;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class ExerciseTwoStack {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		Scanner sc = new Scanner(System.in);
		int option = -1;
		
		do {
			System.out.println("\n" + "*".repeat(50) + "\n");
			System.out.println("\t1 - Add Book on Stack"
					+ "\n\t2 - List all Books"
					+ "\n\t3 - Remove Book from Stack"
					+ "\n\t0 - Exit");
			System.out.println("\n" + "*".repeat(50));
			System.out.print("Enter desired option: ");
			option = sc.nextInt();
			
			switch(option) {
				case 1:
					sc.nextLine();
					System.out.print("\nType the book name: ");
					String book = sc.nextLine();
					stack.add(book);
					showStack(stack);
					System.out.println("\nBook Added!\n");
					break;
				case 2:
					showStack(stack);
					break;
				case 3:
					stack.pop();
					showStack(stack);
					System.out.println("\nBook Removed from top!\n");
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
	
	public static void showStack(Stack<String> stack) {
		Iterator<String> iStack = stack.iterator();
		System.out.println("\nStack: ");
		while(iStack.hasNext()) {
			System.out.println(iStack.next());
		}
	}
}
