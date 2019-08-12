package method.references.staticmethod;

/**
 * Java 8's instance method reference can be used as an alternative to lambdas to
 * provide functional interface implementations.
 *
 */
public class InstanceMethodReference {
	
	@FunctionalInterface
	interface HelloFunctionalInterface {
		String sayHelloTo(String name);

	}
	
	public String helloInstanceMethod(String name) {
		return "Hello " + name;
	}
	
	public static void main(String[] args) {
		
		InstanceMethodReference myInstance = new InstanceMethodReference();
		
		HelloFunctionalInterface helloWithInstanceMethodReference = myInstance::helloInstanceMethod;
		
		System.out.println(helloWithInstanceMethodReference.sayHelloTo("World"));
		
		HelloFunctionalInterface  helloWithAnnonymousObjectInstanceMethodReference = new InstanceMethodReference()::helloInstanceMethod;
		
		System.out.println(helloWithAnnonymousObjectInstanceMethodReference.sayHelloTo("World"));
	}
}
