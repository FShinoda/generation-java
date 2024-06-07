package conditionals;

import java.util.Scanner;

public class ExerciseEightSwitchCase {

	public static void main(String[] args) {
		int codOperacao;
		float saldo = 1000;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Operação: ");
		codOperacao = sc.nextInt();
		
		switch(codOperacao) {
			case 1: // saldo
				System.out.println("Operação - Saldo");
				System.out.printf("Saldo: R$%.2f", saldo);
				break;
			case 2: // saque
				float saque; 
				System.out.print("Valor: ");
				saque = sc.nextFloat();
				System.out.println("Operação - Saque");
				if(saque <= saldo) {
					saldo -= saque;
					System.out.printf("Novo Saldo: R$%.2f", saldo);
				} else {
					System.out.println("Saldo Insuficiente!");
				}
				break;
			case 3: // deposito
				System.out.println("Operação - Depósito");
				float deposito;
				System.out.print("Valor: ");
				deposito = sc.nextFloat();
				saldo += deposito;
				System.out.printf("Novo Saldo: R$%.2f", saldo);
				break; 
			default:
				System.out.println("Operação Inválida!");
				break;	
		}
		
		sc.close();
	}
}
