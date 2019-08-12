package method.references.staticmethod;

import java.util.Arrays;

public class InstanceMethodReferenceFromArbitraryObject {

	public static void main(String[] args) {

		String[] cats = { "York Chocolate", "Wila Krungthep", "Ukrainian Levkoy", "Turkish Van", "Turkish Angora",
				"Toyger", "Tonkinese", "Wichien Maat", "Thai Lilac", "Suphalak", "Sphynx", "Somali", "Scottish Fold",
				"Chartreux", "British Shorthair", "Abyssinian" };
		
		Arrays.sort(cats, String::compareToIgnoreCase);
		Arrays.asList(cats).forEach((cat) -> System.out.println(cat));
	}
}
