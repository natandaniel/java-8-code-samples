package method.references.staticmethod;

/**
 * Java 8's static method reference can be used as an alternative to lambdas to
 * provide functional interface implementations.
 */
public class StaticMethodReferenceFor {

	@FunctionalInterface
	interface HelloFunctionalInterface {
		String sayHelloTo(String name);

	}

	public static void main(String[] args) {

		HelloFunctionalInterface helloInFrenchWithLambda = (name) -> "Bonjour " + name;

		HelloFunctionalInterface helloInEnglishWithStaticMethodReference = StaticMethodReferenceFor::sayHello;

		System.out.println(helloInFrenchWithLambda.sayHelloTo("Monde"));

		System.out.println(helloInEnglishWithStaticMethodReference.sayHelloTo("World"));

	}

	public static String sayHello(String name) {
		return "Hello " + name;
	}

}
