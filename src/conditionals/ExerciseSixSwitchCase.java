package conditionals;

import java.util.Scanner;

public class ExerciseSixSwitchCase {

	public static void main(String[] args) {
		String employeeName;
		int positionCode;
		float employeeSalary;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Employee name: ");
		employeeName = sc.nextLine();
		
		System.out.print("Position: ");
		positionCode = sc.nextInt();
		
		System.out.print("Salary: RS$");
		employeeSalary = sc.nextFloat();
		
		sc.close();
		
		System.out.println("Employee name: "+employeeName);		
		switch(positionCode){
			case 1:
				System.out.println("Position: Gerente");				
				System.out.printf("Updated Salary: R$%.2f", 1.1*employeeSalary);
				break;
			case 2:
				System.out.println("Position: Vendedor");				
				System.out.printf("Updated Salary: R$%.2f", 1.07*employeeSalary);
				break;
			case 3:
				System.out.println("Position: Supervisor");
				System.out.printf("Updated Salary: R$%.2f", 1.09*employeeSalary);
				break;
			case 4:
				System.out.println("Position: Motorista");
				System.out.printf("Updated Salary: R$%.2f", 1.06*employeeSalary);
				break;
			case 5:
				System.out.println("Position: Estoquista");
				System.out.printf("Updated Salary: R$%.2f", 1.05*employeeSalary);
				break;
			case 6:
				System.out.println("Position: Técnico de TI");
				System.out.printf("Updated Salary: R$%.2f", 1.08*employeeSalary);
				break;
		}
	}

}
