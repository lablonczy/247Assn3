package Assn3;//lukacs ablonczy

public class Lights  extends TreeDecorator{

	private ChristmasTree tree;

	public Lights(ChristmasTree tree){
		this.tree = tree;
	}

	public String toString(){
		return tree.description + " + strings of lights";
	}

	public double getCost(){
		return this.tree.getCost() + 2;
	}

}
