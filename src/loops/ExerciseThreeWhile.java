package loops;

import java.util.Scanner;

public class ExerciseThreeWhile {

	public static void main(String[] args) {
		int idade = 0, qtdMenoresVinteUm = -1, qtdMaiorCinquenta = 0;
		Scanner sc = new Scanner(System.in);
		
		while(idade >= 0){
			
			
			if(idade > 50) {
				qtdMaiorCinquenta++;
			} else if (idade < 21) {
				qtdMenoresVinteUm++;
			}
			
			System.out.print("Digite uma idade: ");
			idade = sc.nextInt();
		}
		
		System.out.println("\nTotal de pessoas menores de 21 anos: " + qtdMenoresVinteUm);
		System.out.println("Total de pessoas maiores de 50 anos: " + qtdMaiorCinquenta);
		
		
		sc.close();
	}

}
