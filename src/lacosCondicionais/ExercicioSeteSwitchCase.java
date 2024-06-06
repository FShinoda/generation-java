package lacosCondicionais;

import java.util.Scanner;

public class ExercicioSeteSwitchCase {

	public static void main(String[] args) {
		float numero1, numero2;
		int codOperacao;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o 1º número: ");
		numero1 = sc.nextFloat();
		
		System.out.print("Digite o 2º número: ");
		numero2 = sc.nextFloat();
		
		System.out.print("Operação: ");
		codOperacao = sc.nextInt();
		
		sc.close();
		
		switch(codOperacao){
		case 1: // soma
			System.out.printf("%.1f + %.1f = %.1f", numero1, numero2, numero1+numero2);
			break;
		case 2: // subtracao
			System.out.printf("%.1f - %.1f = %.1f", numero1, numero2, numero1-numero2);
			break;
		case 3: // multiplicacao
			System.out.printf("%.1f * %.1f = %.1f", numero1, numero2, numero1*numero2);
			break;
		case 4: // divisao
			System.out.printf("%.1f / %.1f = %.1f", numero1, numero2, numero1/numero2);
			break;
		default:
			System.out.println("Operação Inválida!");
			break;
		}
	}
}
