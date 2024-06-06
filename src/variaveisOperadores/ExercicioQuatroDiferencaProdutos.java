package variaveisOperadores;

import java.util.Scanner;
 
public class ExercicioQuatroDiferencaProdutos {

	public static void main(String[] args) {
		float n1, n2, n3, n4, diferencaProduto;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("numero1: ");
		n1 = sc.nextFloat();
		
		System.out.print("numero2: ");
		n2 = sc.nextFloat();
		
		System.out.print("numero3: ");
		n3 = sc.nextFloat();
		
		System.out.print("numero4: ");
		n4 = sc.nextFloat();
		
		sc.close();
		
		diferencaProduto = (n1*n2)-(n3*n4);
		System.out.printf("Diferença: %.1f", diferencaProduto);;
	}

}
