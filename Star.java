package Assn03;//lukacs ablonczy
/**
 * Defines Tree decorator type Star
 * @author Lukacs Ablonczy
 */
public class Star extends TreeDecorator {

	private ChristmasTree tree;

	/**
	 * Sets current tree object to a given tree, and current description to the given trees description
	 * @param tree Tree object to add values to
	 */
	public Star(ChristmasTree tree) {
		this.tree = tree;
		this.description = tree.description;
	}

	/**
	 * Adds  + a star on top to tree object's description
	 * @return current tree's description
	 */
	public String toString() {
		tree.description += " + a star on top";
		return tree.description;
	}

	/**
	 * Returns cost value
	 * @return 6 + previous cost
	 */
	public double getCost() {
		return tree.getCost() + 6;
	}

}
