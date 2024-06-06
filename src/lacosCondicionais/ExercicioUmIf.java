package lacosCondicionais;

import java.util.Scanner;

public class ExercicioUmIf {

	public static void main(String[] args) {
		int A, B, C;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número A: ");
		A = sc.nextInt();
		
		System.out.print("\nDigite o número B: ");
		B = sc.nextInt();
		
		System.out.print("\nDigite o número C: ");
		C = sc.nextInt();
		
		if(A+B > C) {
			System.out.printf("\n%d + %d = %d > %d", A, B, A+B, C);
			System.out.println("\n\nA Soma de A + B é Maior do que C");
		} else if (A+B < C) {
			System.out.printf("%d + %d = %d < %d", A, B, A+B, C);
			System.out.println("\n\nA Soma de A + B é Menor do que C");
		} else {
			System.out.printf("%d + %d = %d = %d", A, B, A+B, C);
			System.out.println("\n\nA Soma de A + B é Igual a C");
		}
		
		sc.close();

	}

}
