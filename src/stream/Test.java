package stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {
		List<Person> persons = getPerson();
		
		//filter
		List<Person> feminino = persons.stream()
				.filter(integrante -> integrante.getGender().equals(Gender.FEMININE))
				.collect(Collectors.toList());
		//feminino.forEach(System.out :: println);

		List<Person> sorted = persons.stream()
				.sorted(Comparator
						.comparing(Person :: getAge)
						.thenComparing(Person:: getGender))
				.collect(Collectors.toList());

		//sorted.forEach(System.out::println);
		// All match
		boolean allMatch = persons.stream()
				.allMatch(integrante -> integrante.getAge() > 30);
		System.out.println(allMatch);

		boolean anyMatch = persons.stream()
				.anyMatch(integrante -> integrante.getAge() < 80);
		System.out.println(anyMatch);
	}

	private static List<Person> getPerson() {
		return List.of(
				new Person ("Rebeca", 30, Gender.FEMININE),
				new Person ("Ramona", 30, Gender.MASCULINE),
				new Person ("Roberval", 45, Gender.OTHER),
				new Person ("Judite", 12, Gender.NONBINARY),
				new Person ("Rebeca", 49, Gender.NONBINARY)
				);
	}

}
