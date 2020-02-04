package Assn03;//lukacs ablonczy
/**
 * Defines General Christmas Tree Object type avail for decoration
 * @author Lukacs Ablonczy
 */
public abstract class ChristmasTree {

	protected String description;

	/**
	 * @return the description string passed up by inheriting decorator objects
	 */
	public String toString() {
		return this.description;
	}

	/**
	 * @return Cost value passed up by inheriting objects
	 */
	public abstract double getCost();


}
