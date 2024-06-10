package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class ExerciseFourSet {

	public static void main(String[] args) {
		HashSet<Integer> numbers = new HashSet<Integer>();
		numbers.addAll(Arrays.asList(2, 5, 1, 3, 4, 9, 7, 8, 10, 6));
		Integer number;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Type a number to see if it is on the list: ");
		number = sc.nextInt();

		sc.close();
		
		if(numbers.contains(number)) {
			System.out.printf("\nNumber %d was found!", number );			
		} else {			
			System.out.printf("\nNumber %d is not in the list...", number );			
		}

	}

}
