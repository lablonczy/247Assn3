package Assn3;//lukacs ablonczy

public class Star extends TreeDecorator{

	private ChristmasTree tree;

	public Star(ChristmasTree tree){
		this.tree = tree;
	}

	public String toString(){
		return tree.description + " + a star on top";
	}

	public double getCost(){
		return this.tree.getCost() + 6;
	}

}
