import java.util.ArrayList;
import java.util.List;

/**
 * Composite Class
 * Acts as the Composite to the Elements that can have children and other Composite
 * Sub-collections ==> Island & Lake
 */
public abstract class Composite extends Element{
	/**
	 * All elements that are encompassed inside the scope of the Parent Element
	 * (In our case those Parents are Island & Lake)
	 */
	List<Element> children;
	/**
	 * Element Constructor
	 * @param width  of the element
	 * @param length of the element
	 * @param path   of the element (level in relation to Painting)
	 */
	public Composite(double width, double length, String path) {
		super(width, length, path);
		children = new ArrayList<>();
	}

	/**
	 * A function that will add an element to the list of children
	 * @param element is to be added to the list of children
	 */
	public abstract void addElement(Element element);
}
