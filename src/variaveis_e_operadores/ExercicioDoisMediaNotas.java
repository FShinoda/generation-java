package variaveis_e_operadores;

import java.util.Scanner;

public class ExercicioDoisMediaNotas {

	public static void main(String[] args) {
		float nota1, nota2, nota3, nota4, media;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nota 1: ");
		nota1 = input.nextFloat();
		
		System.out.print("Nota 2: ");
		nota2 = input.nextFloat();
		
		System.out.print("Nota 3: ");
		nota3 = input.nextFloat();
		
		System.out.print("Nota 4: ");
		nota4 = input.nextFloat();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		System.out.printf("Média final: %.1f", media);
	}

}
