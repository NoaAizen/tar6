/**
 * Tree Component == Leaf Component
 * Tree cannot have "children"
 */
public class Tree extends Element {

    int leavesAmount;

    public int getLeavesAmount() {
        return leavesAmount;
    }

    /**
     * Tree Parameter Constructor
     * @param width of the tree
     * @param height of the tree
     * @param leavesAmount on the tree
     * @param path to the tree / level
     */
    public Tree(double width, double height, int leavesAmount, String path) {
        super(width, height, path);
        this.leavesAmount = leavesAmount;
    }

    @Override
     public String getName() {
        return "tree";
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
