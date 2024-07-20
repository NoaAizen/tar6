import java.util.ArrayList;
import java.util.List;

/**
 * Lake Class == A Component in the DP
 */
public class Lake extends Composite {
    private String name;

    /**
     * Lake Parameter Constructor
     * @param name of lake
     * @param diameter of lake
     * @param path of lake / level
     */
    public Lake(String name, double diameter, String path) {
        super(diameter,diameter,path);
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Habitat getHabitat() {
        return Habitat.TERRESTRIAL;
    }

    /**
     * @param visitor
     */
    @Override
    public void accept(IPaintingVisitor visitor) {
        visitor.visit(this);
        for (Element child : children) {
            child.accept(visitor);
        }
    }


    /**
     * A function that will add an element to the children of this Lake,
     * if it is an element that can be inside a Lake
     * @param element is to be checked for compatibility
     */
    @Override
    public void addElement(Element element) {
        if (element.getHabitat() == Habitat.TERRESTRIAL) {
            System.out.println(getName() + " cannot contain " + element.getName() + "\n");
            return;
        }
        children.add(element);
    }
}
