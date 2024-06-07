package variablesAndOperators;

import java.util.Scanner;

public class ExerciseTwoGradesMean {

	public static void main(String[] args) {
		float grade1, grade2, grade3, grade4, mean;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Grade 1: ");
		grade1 = sc.nextFloat();
		
		System.out.print("Grade 2: ");
		grade2 = sc.nextFloat();
		
		System.out.print("Grade 3: ");
		grade3 = sc.nextFloat();
		
		System.out.print("Grade 4: ");
		grade4 = sc.nextFloat();
		
		sc.close();
		
		mean = (grade1 + grade2 + grade3 + grade4) / 4;
		System.out.printf("Final mean is: %.1f", mean);
	}

}
