package Assn03;//lukacs ablonczy
/**
 * Defines Tree decorator type Tinsel
 * @author Lukacs Ablonczy
 */
public class Lights extends TreeDecorator {

	private ChristmasTree tree;

	/**
	 * Sets current tree object to a given tree, and current description to the given trees description
	 * @param tree Tree object to add values to
	 */
	public Lights(ChristmasTree tree) {
		this.tree = tree;
		this.description = tree.description;
	}

	/**
	 * Adds + strings of lights to tree object's description
	 * @return current tree's description
	 */
	public String toString() {
		tree.description += " + strings of lights";
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
