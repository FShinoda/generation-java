package lacos_condicionais;

import java.util.Scanner;

public class ExercicioDoisIf {

	public static void main(String[] args) {
		int numero;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		numero = sc.nextInt();
		
		sc.close();
		
		if(numero % 2 != 0){
			if(numero < 0){
				System.out.printf("O Número %d é ímpar e negativo!", numero);				
			} else {
				System.out.printf("O Número %d é ímpar e positivo!", numero);								
			}
		} else {
			if(numero < 0) {
				System.out.printf("O Número %d é par e negativo!", numero);				
			} else {
				System.out.printf("O Número %d é par e positivo!", numero);				
			}
		}
	}

}
