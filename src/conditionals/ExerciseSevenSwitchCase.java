package conditionals;

import java.util.Scanner;

public class ExerciseSevenSwitchCase {

	public static void main(String[] args) {
		float number1, number2;
		int operationCode;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Type 1st number: ");
		number1 = sc.nextFloat();
		
		System.out.print("Type 2nd number: ");
		number2 = sc.nextFloat();
		
		System.out.print("Operation: ");
		operationCode = sc.nextInt();
		
		sc.close();
		
		switch(operationCode){
		case 1: // sum
			System.out.printf("%.1f + %.1f = %.1f", number1, number2, number1+number2);
			break;
		case 2: // subtraction
			System.out.printf("%.1f - %.1f = %.1f", number1, number2, number1-number2);
			break;
		case 3: // multiplication
			System.out.printf("%.1f * %.1f = %.1f", number1, number2, number1*number2);
			break;
		case 4: // division
			System.out.printf("%.1f / %.1f = %.1f", number1, number2, number1/number2);
			break;
		default:
			System.out.println("Invalid Operation!");
			break;
		}
	}
}
