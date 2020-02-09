package common;

/**
 * 
 * A treasure bag contains a default amount of 10 gold coins.
 *
 */
public class TreasureBag {
	
	private int gold = 10;

	public TreasureBag() {
	}

	public TreasureBag(int newGoldAmount) {
		gold = newGoldAmount;
	}
	
	public int getGold() {
		return gold;
	}
}