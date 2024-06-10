package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class ExerciseThreeSet {

	public static void main(String[] args) {
		HashSet<Integer> numbers = new HashSet<Integer>();
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i < 10; i++) {
			System.out.print("Add a number to the list: ");
			Integer number = sc.nextInt();
			
			numbers.add(number);	
		}
		
		System.out.println("\nListing Set numbers: ");
		Iterator<Integer> iNumbers = numbers.iterator();
		while(iNumbers.hasNext()) {
			System.out.println(iNumbers.next());
		}
		
		sc.close();
	}

}
