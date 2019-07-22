package predicate;

import java.util.function.Predicate;

public class PredicateMain {
	
	public static void main(String[] args) {
				
		Predicate<Cat> isCatOlderThanOnePredicate = (aCatInstance) -> (aCatInstance.getAge()  > 1);
		
		Cat cat = new Cat("Pythie", 5);
		
		if(isCatOlderThanOnePredicate.test(cat)) {
			System.out.println(cat.getName() + " is older than one.");
		}else {
			System.out.println(cat.getName() + " is younger than one.");
		}
		
	}

}
