package Assn3;//lukacs ablonczy

public class Tinsel  extends TreeDecorator{

	private ChristmasTree tree;

	public Tinsel(ChristmasTree tree){
		this.tree = tree;
	}

	public String toString(){
		return tree.description + " + tinsel all around";
	}

	public double getCost(){
		return this.tree.getCost() + 2;
	}

}
