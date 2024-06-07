package loops;

import java.util.Scanner;

public class ExerciseFiveDoWhile {

	public static void main(String[] args) {
		int numero, soma = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("Digite um número: ");
			numero = sc.nextInt();
			
			if(numero > 0) {
				soma += numero;
			}		
		} while(numero != 0);
		
		sc.close();
		System.out.println("\nA soma dos números positivos é: " + soma);
	}
}