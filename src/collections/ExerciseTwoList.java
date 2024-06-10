package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ExerciseTwoList {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.addAll(Arrays.asList(2, 5, 1, 3, 4, 9, 7, 8, 10, 6));
		int position = -1;
		Integer number;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("Type a number to see if it is on the list: ");
			number = sc.nextInt();
			position = numbers.indexOf(number);
			if(position == -1) System.out.println("\n" + number + " isn't on the list.\n");
			
			
		} while(position == -1);
		sc.close();
		
		System.out.printf("\nNumber %d is located at position %d", number, position );
		
	}

}
