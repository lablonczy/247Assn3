package Assn3;//lukacs ablonczy

public class Star extends TreeDecorator {

	private ChristmasTree tree;

	public Star(ChristmasTree tree) {
		this.tree = tree;
		this.description = tree.description;
	}

	public String toString() {
		tree.description += " + a star on top";
		return tree.description;
	}

	public double getCost() {
		return tree.getCost() + 6;
	}

}
