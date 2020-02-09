package funcint.binaryop;

import java.util.Comparator;
import java.util.function.BinaryOperator;

import common.TreasureBag;

public class BinaryOperatorExample3 {

	public static void main(String[] args) {

		TreasureBag tenGoldCoins = new TreasureBag();
		TreasureBag twentyGoldCoins = new TreasureBag(20);

		// BinaryOperator that compares TreasureBags and returns the smallest bag

		BinaryOperator<TreasureBag> smallestTreasureBag = BinaryOperator
				.minBy(Comparator.comparing(treasureBag -> treasureBag.getGold()));

		System.out.println("Comparing treasure bags; expecting bag with 10 gold coins; result : bag with "
				+ smallestTreasureBag.apply(tenGoldCoins, twentyGoldCoins).getGold() + " gold coins");

		// BinaryOperator that compares TreasureBags and returns the biggest bag

		BinaryOperator<TreasureBag> biggestTreasureBag = BinaryOperator
				.maxBy(Comparator.comparing(treasureBag -> treasureBag.getGold()));

		System.out.println("Comparing treasure bags; expecting bag with 20 gold coins; result : bag with "
				+ biggestTreasureBag.apply(tenGoldCoins, twentyGoldCoins).getGold() + " gold coins");
	}
}
