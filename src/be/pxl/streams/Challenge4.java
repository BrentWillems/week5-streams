package be.pxl.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import be.pxl.streams.Person.Gender;

public class Challenge4 {
	public static void main(String[] args) {
		List<Person> personen = Arrays.asList(new Person("Sofie", 23, Gender.FEMALE),
				new Person("Adam", 31, Gender.MALE), new Person("Bastiaan", 25, Gender.MALE),
				new Person("Berend", 22, Gender.MALE), new Person("Aagje", 27, Gender.FEMALE));
		// 1. Geef de gemiddelde leeftijd van alle personen
		// Verwachte output: Gemiddelde leeftijd: 25.6
		int somLeeftijdenAllePersonen = personen.stream().mapToInt(Person::getAge).sum();
		float avg = (float) somLeeftijdenAllePersonen / personen.size();
		System.out.println(avg);

		// 2. Hoeveel mannen staan er in de lijst
		// Verwachte output: Aantal mannen: 3
		int aantalMan = (int) personen.stream().filter(p -> p.getGender() == Gender.MALE).count();
		System.out.println(aantalMan);

		// 3. Hoeveel mannen ouder dan 24 staan er in de lijst
		// Verwachte output: Aantal mannen boven 24: 2
		int aanTalManBoven24 = (int) personen.stream().filter(p -> p.getAge() >= 24)
				.filter(p -> p.getGender() == Gender.MALE).count();
		System.out.println(aanTalManBoven24);
		// 4. Geef de gemiddelde leeftijd van alle mannen
		// Gemiddelde leeftijd mannen: 26.0
		float leeftijdAlleMannen = (float) personen.stream().filter(p -> p.getGender() == Gender.MALE)
				.mapToInt(Person::getAge).sum();
		float avgLeeftijdMannen = leeftijdAlleMannen / personen.stream().filter(p -> p.getGender() == Gender.MALE).count();
		System.out.println(avgLeeftijdMannen);
		// 5. Maak een nieuwe persoon met als naam de eerste letter van iedere persoon
		// in de lijst
		// en als leeftijd de som van alle leeftijden
		// Maak gebruik van de methode .reduce()
	String naam =	personen.stream().map(c -> c.getName().substring(0,1)).reduce("", (acc,el) -> acc + el + "");
	Person persoon = new Person(naam, somLeeftijdenAllePersonen, Gender.MALE);

	}
}
