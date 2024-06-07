package vectorsAndMatrices;

import java.util.Scanner;

public class ExerciseTwoVector {

	public static void main(String[] args) {
		int[] myVector = new int[10];
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i < myVector.length; i++) {			
			System.out.printf("Type the index %d number: ", i);
			myVector[i] = sc.nextInt();
			sum += myVector[i];
		}
		
		System.out.println("\nOdd indexes elements: ");
		for(int i=1; i < myVector.length; i = i+2) {
			System.out.print(myVector[i]+" ");
		}
		
		System.out.println("\nEven elements: ");
		for(int i=0; i < myVector.length; i++) {
			if(myVector[i] % 2 == 0) { 
				System.out.print(myVector[i]+" ");
			}
		}
		
		System.out.println("\nSum: " + sum);
		System.out.printf("Mean: %.2f",(float)(sum/myVector.length));
		
		
		sc.close();
	}

}
