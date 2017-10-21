package be.pxl.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Challenge2 {
	public static void main(String[] args) {
		// maak een stream met 10 random gehele getallen tussen 0 en 30
		// bekijk hiervoor de methode ints(...) in de klasse Random
		List<Integer> array = new Random().ints(0,30).limit(10).boxed().collect(Collectors.toList());
		// filter de getallen die deelbaar zijn door 3
		array.stream().filter( n -> n%3==0).forEach(System.out::println);
		// en geef het maximum 
		System.out.println("/*-/*-/*-");
		array.stream().sorted().reduce((p1,p2) -> p2).ifPresent(System.out::println);
		// gebruik eventueel peek() om een tussenresultaat van de stream te tonen
	}
}
