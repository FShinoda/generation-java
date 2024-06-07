package vectorsAndMatrices;

import java.util.Scanner;

public class ExerciseFourMatrices {

	public static void main(String[] args) {
		float[][] studentGrades = new float[10][4];
		float[] gradesMean = new float[10];
		float sumGrade;
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i < studentGrades.length; i++) { // student
			sumGrade = 0;
			
			for(int j=0; j < studentGrades[i].length; j++) {				
				System.out.printf("Type student %d grade on %d bimester: ", i+1, j+1);
				studentGrades[i][j] = sc.nextFloat();
				sumGrade += studentGrades[i][j];
			}
			
			gradesMean[i] = sumGrade/4;
			System.out.printf("\nThe student %d mean grade is %.1f\n\n", i+1, gradesMean[i]);
		}

		sc.close();
	}
}
