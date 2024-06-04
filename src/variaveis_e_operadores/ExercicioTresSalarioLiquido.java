package variaveis_e_operadores;

import java.util.Scanner;
 
public class ExercicioTresSalarioLiquido {

	public static void main(String[] args) {
		float salarioLiquido, salarioBruto, adicionalNoturno, horasExtras, descontos;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Salário Bruto: ");
		salarioBruto = input.nextFloat();
		
		System.out.print("Adicional Noturno: ");
		adicionalNoturno = input.nextFloat();
		
		System.out.print("Horas Extras: ");
		horasExtras = input.nextFloat();
		
		System.out.print("Descontos: ");
		descontos = input.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras*5) - descontos;
		System.out.printf("Salário Líquido: %.2f", salarioLiquido);;
	}

}
