package conditionals;

import java.util.Scanner;

public class ExerciseOneIf {

	public static void main(String[] args) {
		int A, B, C;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Type number A: ");
		A = sc.nextInt();
		
		System.out.print("\nType number B: ");
		B = sc.nextInt();
		
		System.out.print("\nType number C: ");
		C = sc.nextInt();
		
		if(A+B > C) {
			System.out.printf("\n%d + %d = %d > %d", A, B, A+B, C);
			System.out.println("\n\nA Sum of A + B is greater than C");
		} else if (A+B < C) {
			System.out.printf("%d + %d = %d < %d", A, B, A+B, C);
			System.out.println("\n\nA Sum of A + B is less than C");
		} else {
			System.out.printf("%d + %d = %d = %d", A, B, A+B, C);
			System.out.println("\n\nA Sum of A + B equals C");
		}
		
		sc.close();

	}

}
