package lacos_condicionais;

import java.util.Scanner;

public class ExercicioSeisSwitchCase {

	public static void main(String[] args) {
		String nomeColaborador;
		int codCargo;
		float salarioColaborador;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome do colaborador: ");
		nomeColaborador = sc.nextLine();
		
		System.out.print("Cargo: ");
		codCargo = sc.nextInt();
		
		System.out.print("Salário: RS$");
		salarioColaborador = sc.nextFloat();
		
		sc.close();
		
		System.out.println("Nome do Colaborador: "+nomeColaborador);		
		switch(codCargo){
			case 1:
				System.out.println("Cargo: Gerente");				
				System.out.printf("Salário Reajustado: R$%.2f", 1.1*salarioColaborador);
				break;
			case 2:
				System.out.println("Cargo: Vendedor");				
				System.out.printf("Salário Reajustado: R$%.2f", 1.07*salarioColaborador);
				break;
			case 3:
				System.out.println("Cargo: Supervisor");
				System.out.printf("Salário Reajustado: R$%.2f", 1.09*salarioColaborador);
				break;
			case 4:
				System.out.println("Cargo: Motorista");
				System.out.printf("Salário Reajustado: R$%.2f", 1.06*salarioColaborador);
				break;
			case 5:
				System.out.println("Cargo: Estoquista");
				System.out.printf("Salário Reajustado: R$%.2f", 1.05*salarioColaborador);
				break;
			case 6:
				System.out.println("Cargo: Técnico de TI");
				System.out.printf("Salário Reajustado: R$%.2f", 1.08*salarioColaborador);
				break;
		}
	}

}
