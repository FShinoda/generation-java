package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ExerciseOneList {

	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i < 5; i++) {
			System.out.print("Type a color: ");
			String color = sc.nextLine();
			colors.add(color);
		}
		sc.close();
		
		Iterator<String> iColors = colors.iterator();
		System.out.println("\nListing all colors: ");
		while(iColors.hasNext()) {
			System.out.println(iColors.next());
		}
		
		colors.sort(null);
		System.out.println("\nListing all colors, sorted: ");
		Iterator<String> iColorsSorted = colors.iterator();
		while(iColorsSorted.hasNext()) {
			System.out.println(iColorsSorted.next());
		}
		
	}
}
