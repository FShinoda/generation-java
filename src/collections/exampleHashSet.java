package collections;

import java.util.HashSet;
import java.util.Iterator;

public class exampleHashSet {

	public static void main(String[] args) {
		HashSet<String> setFrutas = new HashSet<String>();
		
		setFrutas.add("Abacate");
		setFrutas.add("Kiwi");
		setFrutas.add("Melão");
		setFrutas.add("Maçã");
		setFrutas.add("Pêra");
		setFrutas.add("Manga");
		
		// imprime tudo
		System.out.println(setFrutas);
		
		// contem ?
		System.out.println("Existe kiwi? " + setFrutas.contains("Kiwi"));
		
		// remover
		setFrutas.remove("Kiwi");
		
		System.out.println("Existe kiwi? " + setFrutas.contains("Kiwi"));
		
		for(String fruta : setFrutas) {
			if(fruta != null) {
				System.out.println("O hashcode do elemento " + fruta + " é " + fruta.hashCode());
			}
		}
		
		Iterator<String> iSetFrutas = setFrutas.iterator();
		
		while(iSetFrutas.hasNext()) {
			System.out.println(iSetFrutas.next());
		}
		

	}

}
