package vectorsAndMatrices;

public class ExerciseThreeMatrices {

	public static void main(String[] args) {
		int[][] sampleMatrice = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		String mainDiagonal = ""
				, secondaryDiagonal = "";
		int sumMainDiagonal = 0
				, sumSecondaryDiagonal = 0;
		
		for(int i=0; i<sampleMatrice.length; i++) {
			for(int j=0; j<sampleMatrice.length; j++) {
				
				if(i == (sampleMatrice.length-1)-j){ // secondaryDiagonal
					secondaryDiagonal += sampleMatrice[i][j] + " ";
					sumSecondaryDiagonal += sampleMatrice[i][j];
				}
				if(i==j) { // mainDiagonal
					mainDiagonal += sampleMatrice[i][j] + " ";
					sumMainDiagonal += sampleMatrice[i][j];
				}
			}
		}
		
		System.out.printf("\nMain Diagonal elements:\n%s\n", mainDiagonal);
		System.out.printf("\nLeft Diagonal elements:\n%s\n", secondaryDiagonal);
		System.out.printf("\nMain Diagonal elements sum:\n%s\n", sumMainDiagonal);
		System.out.printf("\nLeft Diagonal elements sum:\n%s\n", sumSecondaryDiagonal);
	}
}
