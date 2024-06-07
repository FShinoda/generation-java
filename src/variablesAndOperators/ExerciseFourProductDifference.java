package variablesAndOperators;

import java.util.Scanner;
 
public class ExerciseFourProductDifference {

	public static void main(String[] args) {
		float n1, n2, n3, n4, productDifference;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("number1: ");
		n1 = sc.nextFloat();
		
		System.out.print("number2: ");
		n2 = sc.nextFloat();
		
		System.out.print("number3: ");
		n3 = sc.nextFloat();
		
		System.out.print("number4: ");
		n4 = sc.nextFloat();
		
		sc.close();
		
		productDifference = (n1*n2)-(n3*n4);
		System.out.printf("Difference: %.1f", productDifference);;
	}

}
