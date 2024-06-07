package vectorsAndMatrices;

import java.util.Scanner;

public class ExerciseOneVector {

	public static void main(String[] args) {
		int[] sampleVector = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		int numberToFind;
		boolean found = false;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Type the number that you want to find: ");
		numberToFind = sc.nextInt();
		sc.close();
		
		for(int i=0; i < sampleVector.length; i++) {
			if(sampleVector[i] == numberToFind) {
				found = true;
				System.out.printf("\nThe number %d is located at position: %d", numberToFind, i);
				break;
			}
		}
		
		if(!found) System.out.printf("\nNumber %d was not found inside vector!", numberToFind);		
	}
}
