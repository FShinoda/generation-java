package conditionals;

import java.util.Scanner;

public class ExerciseFiveSwitchCase {

	public static void main(String[] args) {
		int codItem, qtdComprada;
		Scanner sc = new Scanner(System.in);
			
		System.out.print("Código do Produto: ");
		codItem = sc.nextInt();
		
		System.out.print("Quantidade: ");
		qtdComprada = sc.nextInt();
		
		sc.close();
		
		switch(codItem) {
			case 1:
				System.out.println("Produto: Cachorro Quente");
				System.out.printf("Valor total: R$ %.2f", (float)10*qtdComprada);
				break;
			case 2:
				System.out.println("Produto: X-Salada");
				System.out.printf("Valor total: R$ %.2f", (float)15*qtdComprada);
				break;
			case 3:
				System.out.println("Produto: X-Bacon");
				System.out.printf("Valor total: R$ %.2f", (float)18*qtdComprada);
				break;
			case 4:
				System.out.println("Produto: Bauru");
				System.out.printf("Valor total: R$ %.2f", (float)12*qtdComprada);
				break;
			case 5:
				System.out.println("Produto: Refrigerante");
				System.out.printf("Valor total: R$ %.2f", (float)8*qtdComprada);
				break;
			case 6:
				System.out.println("Produto: Suco de Laranja");
				System.out.printf("Valor total: R$ %.2f", (float)13*qtdComprada);
				break;
		}
	}
}
