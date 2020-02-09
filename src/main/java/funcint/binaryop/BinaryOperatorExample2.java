package funcint.binaryop;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

import common.TreasureBag;

public class BinaryOperatorExample2 {

	public static void main(String[] args) {

		TreasureBag tenGoldCoins = new TreasureBag();
		TreasureBag twentyGoldCoins = new TreasureBag(20);

		BinaryOperator<TreasureBag> sumTreasureBags = (treasureBagOne, treasureBagTwo) -> {
			return new TreasureBag(treasureBagOne.getGold() + treasureBagTwo.getGold());
		};

		// BiFunction obtained from a binary operator that sums TreasureBags; returns the result as a String.

		BiFunction<TreasureBag, TreasureBag, String> sumTreasureBagsAndReturnResultAsString = sumTreasureBags
				.andThen(treasureBag -> String.valueOf(treasureBag.getGold()));

		System.out.println("Adding treasure bags and returning result as string; expecting 30 gold coins; result : "
				+ sumTreasureBagsAndReturnResultAsString.apply(tenGoldCoins, twentyGoldCoins) + " gold coins");
	}

}
