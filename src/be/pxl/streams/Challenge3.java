package be.pxl.streams;

import java.util.Arrays;
import java.util.List;

import com.sun.xml.internal.ws.util.StringUtils;

public class Challenge3 {
	public static void main(String[] args) {
		List<String> topNames = Arrays.asList(
                "Amelia",
                "Olivia",
                "emily",
                "Isla",
                "Ava",
                "oliver",
                "Jack",
                "Charlie",
                "harry",
                "Jacob"
        );
		// 1. Druk alle namen van de lijst af in gesorteerde volgorde.
		// Zorg dat de eerste letter van een naam steeds met hoofdletter begint.
		
		topNames.stream().map(n -> StringUtils.capitalize(n)).sorted().forEach(System.out::println);
		
		
		// 2. Druk alle namen af die beginnen met A (of a)
		// Zorg dat de eerste letter van een naam steeds met hoofdletter begint.
		// Verwachte output: Amelia Ava
		topNames.stream().map(n -> StringUtils.capitalize(n)).sorted().filter(l -> l.startsWith("A")).forEach(System.out::println);
		
		
		// 3. Hoeveel namen beginnen er met A
		// Verwachte output: 2
	long aantalNamenBeginnenMetA =	topNames.stream().map(n -> StringUtils.capitalize(n)).sorted().filter(l -> l.startsWith("A")).count();
	System.out.println(aantalNamenBeginnenMetA);
		
	}
}
