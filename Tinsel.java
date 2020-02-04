package Assn3;//lukacs ablonczy

public class Tinsel extends TreeDecorator {

	private ChristmasTree tree;

	public Tinsel(ChristmasTree tree) {
		this.tree = tree;
		this.description = tree.description;
	}

	public String toString() {
		tree.description += " + tinsel all around";
		return tree.description;
	}

	public double getCost() {
		return tree.getCost() + 2;
	}

}
