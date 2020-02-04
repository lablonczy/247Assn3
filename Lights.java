package Assn3;//lukacs ablonczy

public class Lights extends TreeDecorator {

	private ChristmasTree tree;

	public Lights(ChristmasTree tree) {
		this.tree = tree;
		this.description = tree.description;
	}

	public String toString() {
		tree.description += " + strings of lights";
		return tree.description;
	}

	public double getCost() {
		return tree.getCost() + 2;
	}

}
