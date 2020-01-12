package funcint.predicate;

import java.util.function.Predicate;

class PredicateMain {

	private static class Cat {

		private String name;
		private float age;

		public Cat(String name, float age) {
			this.name = name;
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public float getAge() {
			return age;
		}
	}

	public static void main(String[] args) {

		Predicate<Cat> isCatOlderThanOne = (cat) -> (cat.getAge() >= 1.0f);

		Cat pythie = new Cat("Pythie", 5.0f);
		Cat minou = new Cat("Minou", 0.5f);

		if (isCatOlderThanOne.test(pythie)) {
			System.out.println(pythie.getName() + " is older than one.");
		} else {
			System.out.println(pythie.getName() + " is younger than one.");
		}

		if (isCatOlderThanOne.test(minou)) {
			System.out.println(minou.getName() + " is older than one.");
		} else {
			System.out.println(minou.getName() + " is younger than one.");
		}
	}
}
