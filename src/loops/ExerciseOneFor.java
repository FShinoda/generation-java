package loops;

import java.util.Scanner;

public class ExerciseOneFor {

	public static void main(String[] args) {
		int numero1, numero2;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número do intervalo: ");
		numero1 = sc.nextInt();
		System.out.print("Digite o segundo número do intervalo: ");
		numero2 = sc.nextInt();
		
		sc.close();
		
		if(numero2 > numero1) {
			for(int i=numero1; i <= numero2; i++) {
				if(i % 3 == 0 && i % 5 == 0) {
					System.out.printf("\n%d é multiplo de 3 e 5", i);
				}
			}
		} else {
			System.out.println("\nIntervalo inválido!");
		}
	}

}
