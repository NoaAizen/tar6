/**
 * Element Class == Component in the Composite Design Pattern
 */
public abstract class Element{
    /**
     * the width of the element
     */
    protected double width;
    /**
     * length of the element
     */
    protected double length;
    /**
     * level of this element in our painting
     * It will contain the "full path" to the element we want
     */
    private String path;
    /**
     * the name of the element
     */
    private String name;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    /**
     * Element Constructor
     * @param width of the element
     * @param length of the element
     * @param path of the element (level in relation to Painting)
     */
    public Element(double width, double length, String path) {
        this.width = width;
        this.length = length;
        this.path= path == null ? "" : path;
    }


    public String getPath(){
        return path;
    }
    public String getFullName(){
        return path.isEmpty() ? getName() : path + "/" + getName();
    }
    public abstract String getName();
    public abstract Habitat getHabitat();
//    public abstract void addElement(Element element);
    public abstract void accept(IPaintingVisitor visitor);

}
