package variablesAndOperators;

import java.util.Scanner;
 
public class ExerciseOneSalaryUpdate {

	public static void main(String[] args) {
		float salary, update, newSalary;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Salary: ");
		salary = sc.nextFloat();
		
		System.out.print("Update: ");
		update = sc.nextFloat();
		
		sc.close();
		
		newSalary = salary + update;
		
		System.out.printf("Novo salário: %.2f", newSalary);
	}

}
