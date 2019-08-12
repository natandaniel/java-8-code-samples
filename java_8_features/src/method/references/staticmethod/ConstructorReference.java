package method.references.staticmethod;

public class ConstructorReference {

	public static void main(String[] args) {

		SayHello sayHello = Hello::new;
		sayHello.hello("World !");
	}
}

@FunctionalInterface
interface SayHello {

	Hello hello(String name);
}

class Hello {

	Hello(String name) {
		System.out.println("Hello " + name);
	}
}
