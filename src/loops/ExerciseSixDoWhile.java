package loops;

import java.util.Scanner;

public class ExerciseSixDoWhile {

	public static void main(String[] args) {
		int numero, qtdMultiplosTres=0, soma=0;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("Digite um número: ");
			numero = sc.nextInt();
			
			if(numero == 0) {
				break;
			}
			if(numero % 3 == 0) {
				qtdMultiplosTres++;
				soma += numero;
			}
		} while(numero != 0);
		
		sc.close();

		System.out.println("A média de todos os números múltiplos de 3: "+ ((float)soma/(float)qtdMultiplosTres));
	}
}
