/**
 * Flag Class == Leaf Component
 */
public class Flag extends Element {
    /**
     * The color of the flag
     */
    Color color;
    /**
     * Length of the pole
     */
    int carrierHeight;

    /**
     * Flag Parameter Constructor
     * @param width of the flag
     * @param length
     * @param color of flag
     * @param carrierHeight
     * @param path
     */
    public Flag(double width, double length, Color color, int carrierHeight, String path) {
        super(width, length, path);
        this.color = color;
        this.carrierHeight = carrierHeight;
    }

 
    public Color getColor() {
        return color;
    }

    public int getCarrierHeight() {
        return carrierHeight;
    }

    @Override
    public String getName() {
        return Flag.class.getSimpleName().toLowerCase();
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
    }
}
