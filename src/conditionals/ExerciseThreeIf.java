package conditionals;

import java.util.Scanner;

public class ExerciseThreeIf {
	public static void main(String[] args) {
		String donatorName;
		int donatorAge;
		boolean firstDonation;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Type donator's name: ");
		donatorName = sc.nextLine();
		
		System.out.print("Type donator's age: ");
		donatorAge = sc.nextInt();
		
		System.out.println("Is first blood donation? ");
		firstDonation = sc.nextBoolean();
		
		sc.close();
		
		if(donatorAge >= 18 && donatorAge < 60) {
			System.out.printf("%s can donate blood!", donatorName);
		} else if (donatorAge >= 60 && donatorAge <= 69 && firstDonation == false) {
			System.out.printf("%s can donate blood!", donatorName);

		} else {
			System.out.printf("%s can't donate blood!", donatorName);

		}
	}
}
