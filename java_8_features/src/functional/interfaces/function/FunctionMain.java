package functional.interfaces.function;

import java.util.function.Function;

public class FunctionMain {

	public static void main(String[] args) {
		
		
		Function<String, Integer> fromTextToInt = (aNumberAsText) -> Integer.valueOf(aNumberAsText);
		
		int fortyTwo = fromTextToInt.apply("42");
		
		System.out.println(fortyTwo);
	}

}
