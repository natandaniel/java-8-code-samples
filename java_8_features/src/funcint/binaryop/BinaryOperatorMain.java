package funcint.binaryop;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

/**
 * 
 * Illustration of the {@link BinaryOperator} functional interface.
 * 
 */
class BinaryOperatorMain {

	/**
	 * 
	 * A treasure bag contains a default amount of 10 gold coins.
	 *
	 */
	private static class TreasureBag {
		private int gold = 10;

		TreasureBag() {
		}

		TreasureBag(int newGoldAmount) {
			gold = newGoldAmount;
		}
	}

	public static void main(String[] args) {

		TreasureBag tenGoldCoins = new TreasureBag();
		TreasureBag twentyGoldCoins = new TreasureBag(20);

		// BinaryOperator that sums TreasureBags

		BinaryOperator<TreasureBag> sumTreasureBags = (treasureBagOne, treasureBagTwo) -> {
			return new TreasureBag(treasureBagOne.gold + treasureBagTwo.gold);
		};

		System.out.println("Adding treasure bags; expecting 30 gold coins; result : "
				+ sumTreasureBags.apply(tenGoldCoins, twentyGoldCoins).gold + " gold coins");

		// BinaryOperator that sums TreasureBags then returns the result as a String.

		BiFunction<TreasureBag, TreasureBag, String> sumTreasureBagsAndReturnResultAsString = sumTreasureBags
				.andThen(treasureBag -> String.valueOf(treasureBag.gold));

		System.out.println("Adding treasure bags and returning result as string; expecting 30 gold coins; result : "
				+ sumTreasureBagsAndReturnResultAsString.apply(tenGoldCoins, twentyGoldCoins) + " gold coins");

		// BinaryOperator that compares TreasureBags and returns the smallest bag

		BinaryOperator<TreasureBag> smallestTreasureBag = BinaryOperator
				.minBy((bag1, bag2) -> Integer.compare(((TreasureBag) bag1).gold, ((TreasureBag) bag2).gold));

		System.out.println("Comparing treasure bags; expecting bag with 10 gold coins; result : bag with "
				+ smallestTreasureBag.apply(tenGoldCoins, twentyGoldCoins).gold + " gold coins");

		// BinaryOperator that compares TreasureBags and returns the biggest bag

		BinaryOperator<TreasureBag> biggestTreasureBag = BinaryOperator
				.maxBy((bag1, bag2) -> Integer.compare(((TreasureBag) bag1).gold, ((TreasureBag) bag2).gold));

		System.out.println("Comparing treasure bags; expecting bag with 10 gold coins; result : bag with "
				+ biggestTreasureBag.apply(tenGoldCoins, twentyGoldCoins).gold + " gold coins");
	}
}
