package loops;

import java.util.Scanner;

public class ExerciseTwoFor {

	public static void main(String[] args) {
		int numero, qtdPares = 0, qtdImpares = 0;
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i < 10; i++) {
			
			System.out.printf("\nDigite o %dº número: ", i+1);
			numero = sc.nextInt();
			
			if(numero % 2 == 0) {
				qtdPares++;
			} else {
				qtdImpares++;
			}
		}
		
		sc.close();
		
		System.out.println("\nTotal números pares: " +qtdPares);
		System.out.println("Total números ímpares: " +qtdImpares);
	}

}
