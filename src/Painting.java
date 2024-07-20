 
import java.util.*;

/**
 * Painting Class == Wraps everything
 */
public class Painting {
    Map<String, Element> pathToElementMap;
    List<Element> elementList;


    /**
     * Painting Constructor
     * Creates an empty list of elements (ArrayList)
     * Creates an empty map (of pairs) == (full path to element, element in question), using (HashMap)
     */
    Painting(){
        elementList=new ArrayList<>();
        pathToElementMap = new HashMap<>();
    }

    /**
     * Adds and element to the Painting (can be anything)
     * @param element can be of any type (that was mentioned previously)
     */
    public void addElement(Element element){
        pathToElementMap.put(element.getFullName(), element);
        if (element.getPath().isEmpty()){
            // if the path == the nesting of elements 0 -> we can just add it, and
            // we don't need to look further into the element and find other nested elements!
            elementList.add(element);
        }
        else {
            // containingElement will be the element that has at least one nested level inside it
            Composite containingElement =  (Composite) pathToElementMap.get(element.getPath());
            containingElement.addElement(element);
        }
    }

    public String getName() {
        return Painting.class.getSimpleName().toLowerCase();
    }

    /**
     * Function to call visitor of type CountingVisitor
     * @return The amount of elements in the painting
     */
    public int getCount() {
        IPaintingVisitor v = new CountingVisitor();
        for (Element element : elementList) {
            element.accept(v);
        }
        return ((CountingVisitor) v).getCount();
    }

    /**
     * Function to call visitor of type AreaCalcVisitor
     * @return The sum of all areas in the painting
     */
    public int getArea() {
        IPaintingVisitor v = new AreaCalcVisitor();
        for (Element element : elementList) {
            element.accept(v);
        }
        return ((AreaCalcVisitor) v).getArea();
    }

    /**
     * A function to call the ShortRepVisitor
     * Which will print the Short Representation of all existing elements
     * inside this painting
     */
    public void getShort() {
        IPaintingVisitor v = new ShortRepVisitor();
        for (Element element : elementList) {
            element.accept(v);
        }
    }

    /**
     * A function that calls the LongRepVisitor
     * Which will print a detailed description of all the elements in this painting
     */
    public void getLong() {
        IPaintingVisitor v = new LongRepVisitor();
        for (Element element : elementList) {
            element.accept(v);
        }
    }
}
