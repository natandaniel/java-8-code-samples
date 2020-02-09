package funcint.unaryop;

import java.util.function.UnaryOperator;

/**
 * 
 * Illustration of the {@link UnaryOperator} functional interface. 
 *
 */
class UnaryOperatorMain {

	private static class Binary {
		private int value = 0;
	}

	public static void main(String[] args) {

		UnaryOperator<Binary> changeBit = (binary) -> {
			binary.value = 1 - binary.value;
			return binary;
		};

		Binary binary = new Binary();

		System.out.println("Binary initial value : " + binary.value + "; applying changeBit, new value : "
				+ changeBit.apply(binary).value);
		System.out.println("Binary initial value : " + binary.value + "; applying changeBit, new value : "
				+ changeBit.apply(binary).value);
	}

}
