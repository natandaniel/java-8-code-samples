package fr.ndaniel.java;

public class HelloMain {
	
	public static void main(String[] args) {
		
		// Old fashioned anonymous class 
		HelloFunctionalInterface helloFiOldWorld = new HelloFunctionalInterface() {
			
			@Override
			public String sayHelloTo(String name) {
				return "Hello " + name;
			}
		};
		
		// More compact and cleaner lambda style
		HelloFunctionalInterface helloFiNewWorld = (name) -> {
			return "Hello " + name;
		};
		
		System.out.println(helloFiOldWorld.sayHelloTo("Old World"));
		System.out.println(helloFiNewWorld.sayHelloTo("New World"));
	}

}
