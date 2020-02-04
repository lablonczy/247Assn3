package Assn03;//lukacs ablonczy
/**
 * Defines Tree decorator type Tinsel
 * @author Lukacs Ablonczy
 */
public class Tinsel extends TreeDecorator {

	private ChristmasTree tree;

	/**
	 * Sets current tree object to a given tree, and current description to the given trees description
	 * @param tree Tree object to add values to
	 */
	public Tinsel(ChristmasTree tree) {
		this.tree = tree;
		this.description = tree.description;
	}

	/**
	 * Adds + tinsel all around to tree object's description
	 * @return current tree's description
	 */
	public String toString() {
		tree.description += " + tinsel all around";
		return tree.description;
	}

	/**
	 * Returns cost value
	 * @return 2 + previous cost
	 */
	public double getCost() {
		return tree.getCost() + 2;
	}

}
