package variablesAndOperators;

import java.util.Scanner;
 
public class ExerciseThreeNetSalary {

	public static void main(String[] args) {
		float netSalary, grossSalary, nightShiftExtra, extraHours, deduct;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Gross Salary: ");
		grossSalary = sc.nextFloat();
		
		System.out.print("Night shift extra: ");
		nightShiftExtra = sc.nextFloat();
		
		System.out.print("Extra Hours: ");
		extraHours = sc.nextFloat();
		
		System.out.print("Deduct: ");
		deduct = sc.nextFloat();
		
		sc.close();
		
		netSalary = grossSalary + nightShiftExtra + (extraHours*5) - deduct;
		System.out.printf("Net Salary: %.2f", netSalary);;
	}

}
