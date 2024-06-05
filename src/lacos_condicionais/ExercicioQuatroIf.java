package lacos_condicionais;

import java.util.Scanner;

public class ExercicioQuatroIf {

	public static void main(String[] args) {
		String vertebrado, tipo, alimentacao;
		Scanner sc = new Scanner(System.in);
		
		vertebrado = sc.nextLine();
		tipo = sc.nextLine();
		alimentacao = sc.nextLine();
		
		sc.close();
		
		if(vertebrado.equalsIgnoreCase("vertebrado")) {
			if(tipo.equalsIgnoreCase("ave")) {
				if(alimentacao.equalsIgnoreCase("Carnívoro")) {
					System.out.println("Águia");
				} else if(alimentacao.equalsIgnoreCase("Onívoro")) {
					System.out.println("Pomba");
				}
			} else if(tipo.equalsIgnoreCase("Mamífero")){
				if(alimentacao.equalsIgnoreCase("Onívoro")) {
					System.out.println("Homem");
				} else if(alimentacao.equalsIgnoreCase("Herbívoro")) {
					System.out.println("Vaca");
				}
			}
		} else if(vertebrado.equalsIgnoreCase("invertebrado")){
			if(tipo.equalsIgnoreCase("inseto")) {
				if(alimentacao.equalsIgnoreCase("Hematófago")) {
					System.out.println("Pulga");
				} else if(alimentacao.equalsIgnoreCase("Herbívoro")) {
					System.out.println("Lagarta");
				}
			} else if(tipo.equalsIgnoreCase("anelídeo")){
				if(alimentacao.equalsIgnoreCase("Hematófago")) {
					System.out.println("Sanguessuga");
				} else if(alimentacao.equalsIgnoreCase("Onívoro")) {
					System.out.println("Minhoca");
				}
			}
		}
		
	}

}
