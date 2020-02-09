package funcint.binaryop;

import java.util.function.BinaryOperator;

import common.TreasureBag;

/**
 * 
 * Illustration of the {@link BinaryOperator} functional interface.
 * 
 */
class BinaryOperatorExample1 {

	public static void main(String[] args) {

		TreasureBag tenGoldCoins = new TreasureBag();
		TreasureBag twentyGoldCoins = new TreasureBag(20);

		// BinaryOperator that sums TreasureBags

		BinaryOperator<TreasureBag> sumTreasureBags = (treasureBagOne, treasureBagTwo) -> {
			return new TreasureBag(treasureBagOne.getGold() + treasureBagTwo.getGold());
		};

		System.out.println("Adding treasure bags; expecting 30 gold coins; result : "
				+ sumTreasureBags.apply(tenGoldCoins, twentyGoldCoins).getGold() + " gold coins");
	}
}
