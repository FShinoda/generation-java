package lacos_condicionais;

import java.util.Scanner;

public class ExerciciosTresIf {
	public static void main(String[] args) {
		String nomeDoador;
		int idadeDoador;
		boolean primeiraDoacao;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o Nome do doador: ");
		nomeDoador = sc.nextLine();
		
		System.out.print("Digite a Idade do doador: ");
		idadeDoador = sc.nextInt();
		
		System.out.println("Primeira doação de sangue? ");
		primeiraDoacao = sc.nextBoolean();
		
		sc.close();
		
		if(idadeDoador >= 18 && idadeDoador < 60) {
			System.out.printf("%s está apto para doa sangue!", nomeDoador);
		} else if (idadeDoador >= 60 && idadeDoador <= 69 && primeiraDoacao == false) {
			System.out.printf("%s está apto para doar sangue!", nomeDoador);

		} else {
			System.out.printf("%s não está apto para doar sangue!", nomeDoador);

		}
	}
}
