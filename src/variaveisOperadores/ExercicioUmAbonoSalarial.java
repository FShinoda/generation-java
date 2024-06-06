package variaveisOperadores;

import java.util.Scanner;
 
public class ExercicioUmAbonoSalarial {

	public static void main(String[] args) {
		float salario, abono, novoSalario;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Salário: ");
		salario = sc.nextFloat();
		
		System.out.print("Abono: ");
		abono = sc.nextFloat();
		
		sc.close();
		
		novoSalario = salario + abono;
		
		System.out.printf("Novo salário: %.2f", novoSalario);
	}

}
