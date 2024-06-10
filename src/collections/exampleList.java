package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class exampleList {

	public static void main(String[] args) {
		ArrayList<Double> notas = new ArrayList<Double>();
		
		Double y = Double.valueOf(9);
		
		notas.add(y);
		notas.add(7.0);
		notas.add(10.0);
		notas.add(4.0);
		notas.add(6.5);
		notas.add(5.0);
		
		System.out.println("a pos da nota 5 é: "+notas.indexOf(5d));
		System.out.println("se existe x nota na lista: " +notas.contains(5d));
		System.out.println("a 3a posicao da lista é a nota: " + notas.get(2));
		notas.set(notas.indexOf(5d), 10d);
		
		notas.remove(notas.indexOf(4d));
		notas.isEmpty();
		notas.size();
		
		for(Double nota : notas) {
			System.out.println(nota);
		}
		
		// Interface iterator
		Iterator<Double> iNotas = notas.iterator();
		
		while(iNotas.hasNext()) {
			System.out.println(iNotas.next());
		}
		
		

	}

}
