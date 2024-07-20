import java.util.ArrayList;
import java.util.List;

/**
 * Island Class
 * It is the Composite to Element
 * Because an Island contains a list of "children" who all extend from Element
 */
public class Island extends Composite {
//    public List<Element> children; // = new ArrayList<Element>();
    private String name;

    /**
     * Parameter Constructor
     * @param name of the island
     * @param diameter of the island
     * @param path to get to this element (at what level is it from Painting)
     */
    public Island(String name, double diameter, String path) {
        super(diameter,diameter, path);
        // width == length == diameter
        this.name = name;
    }

    @Override
    public String getName() {
        return  name;
    }

    @Override
    public Habitat getHabitat() {
        return Habitat.AQUATIC;
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
     * Anything that can be contained inside the Island Element will be saved in here
     * @param element is to be checked for type
     */
    @Override
    public void addElement(Element element) {
        if (element.getHabitat() == Habitat.AQUATIC) {
            System.out.println(getName() + " cannot contain " + element.getName() + "\n");
            return;
        }
        children.add(element);
    }
}
