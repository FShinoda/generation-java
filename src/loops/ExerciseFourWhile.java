package loops;

import java.util.Scanner;

public class ExerciseFourWhile {

	public static void main(String[] args) {
		int idade, identidadeGenero, pessoaDesenvolvedora
			, devBack=0, frontMulheres=0, mobileMaiorQuarentaHomem=0, fullstackNbMenoresTrinta=0, totalPessoas=0, somaIdade=0;
		char continuar = 'S';
		Scanner sc = new Scanner(System.in);
		
		while(continuar == 'S') {
			
			System.out.print("\nIdade: ");
			idade = sc.nextInt();
			System.out.print("Identidade de Gênero: ");
			identidadeGenero = sc.nextInt();
			System.out.print("Pessoa Desenvolvedora: ");
			pessoaDesenvolvedora = sc.nextInt();
			
			somaIdade += idade;
			totalPessoas++;
			
			if(pessoaDesenvolvedora == 1) {
				devBack++;
			} else if ((identidadeGenero == 1 || identidadeGenero == 4) && pessoaDesenvolvedora == 2) {
				frontMulheres++;
			} else if((identidadeGenero == 2 || identidadeGenero == 5) && pessoaDesenvolvedora == 3 && idade > 40) {
				mobileMaiorQuarentaHomem++;
			} else if(identidadeGenero == 3 && pessoaDesenvolvedora == 4 && idade < 30) {
				fullstackNbMenoresTrinta++;
			}
			
			System.out.print("\nDeseja continuar (S/N): ");
			continuar = sc.next().toUpperCase().charAt(0);
		}
		
		System.out.println("\nTotal de pessoas dev Backend: "+devBack);
		System.out.println("Total de Mulheres Cis e Trans desenvolvedoras Frontend: " +frontMulheres);
		System.out.println("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " +mobileMaiorQuarentaHomem);
		System.out.println("Total de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: " +fullstackNbMenoresTrinta);
		System.out.println("O número total de pessoas que responderam à pesquisa: " +totalPessoas);
		System.out.printf("A média de idade das pessoas que responderam à pesquisa: %.2f", ((float)somaIdade/(float)totalPessoas));
		
		sc.close();
	}

}
