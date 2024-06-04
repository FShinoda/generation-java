package variaveis_e_operadores;

import java.util.Scanner;
 
public class ExercicioUmAbonoSalarial {

	public static void main(String[] args) {
		float salario, abono, novoSalario;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Salário: ");
		salario = input.nextFloat();
		
		System.out.print("Abono: ");
		abono = input.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.printf("Novo salário: %.2f", novoSalario);
	}

}
