package variaveis_e_operadores;

import java.util.Scanner;
 
public class ExercicioTresSalarioLiquido {

	public static void main(String[] args) {
		float salarioLiquido, salarioBruto, adicionalNoturno, horasExtras, descontos;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Salário Bruto: ");
		salarioBruto = sc.nextFloat();
		
		System.out.print("Adicional Noturno: ");
		adicionalNoturno = sc.nextFloat();
		
		System.out.print("Horas Extras: ");
		horasExtras = sc.nextFloat();
		
		System.out.print("Descontos: ");
		descontos = sc.nextFloat();
		
		sc.close();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras*5) - descontos;
		System.out.printf("Salário Líquido: %.2f", salarioLiquido);;
	}

}
