package conditionals;

import java.util.Scanner;

public class ExerciseTwoIf {

	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Type a number: ");
		number = sc.nextInt();
		
		sc.close();
		
		if(number % 2 != 0){
			if(number < 0){
				System.out.printf("Number %d is negative and odd!", number);				
			} else {
				System.out.printf("Number %d is positive and odd!", number);								
			}
		} else {
			if(number < 0) {
				System.out.printf("Number %d is negative and even!", number);				
			} else {
				System.out.printf("Number %d is positive and even!", number);				
			}
		}
	}

}
