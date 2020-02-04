package Assn03;//lukacs ablonczy
/**
 * Defines Fake Christmas Tree Object type avail for decoration
 * @author Lukacs Ablonczy
 */
public class FakeChristmasTree extends ChristmasTree {

	/**
	 * Sets instance inherited description value to Artificial Christmas Tree
	 */
	public FakeChristmasTree() {
		this.description = "Artificial Christmas Tree";
	}

	/**
	 * Returns cost value
	 * @return 50
	 */
	public double getCost() {
		return 50;
	}

}
