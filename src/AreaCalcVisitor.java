import static java.lang.Math.pow;

public class AreaCalcVisitor implements IPaintingVisitor {
    private double area = 0;

    public int getArea() {
        return (int) Math.round(area);
    }
    /**
     * @param painting
     */
    @Override
    public void visit(Painting painting) { }

    /**
     * @param island
     */
    @Override
    public void visit(Island island) {
        area += pow(island.getWidth()/2, 2)*Math.PI;
    }

    /**
     * @param lake
     */
    @Override
    public void visit(Lake lake) {
        area += pow(lake.getWidth()/2, 2)*Math.PI;
    }

    /**
     * @param flag
     */
    @Override
    public void visit(Flag flag) {
        area += flag.getWidth()*flag.getLength();
    }

    /**
     * @param kite
     */
    @Override
    public void visit(Kite kite) {
        area += (kite.getWidth()*kite.getLength())/2;
    }

    /**
     * @param kid
     */
    @Override
    public void visit(Kid kid) {
        area += pow(kid.getWidth()/2, 2)*Math.PI;  // the head
        area += kid.getWidth() * (kid.getLength() - kid.getWidth());
    }

    /**
     * @param tree
     */
    @Override
    public void visit(Tree tree) {
        area += (tree.getWidth()/2) * tree.getLength();
    }

    /**
     * @param boat
     */
    @Override
    public void visit(Boat boat) {
        area += (pow(boat.getWidth()/2, 2)*Math.PI)/2 + (boat.getLength() - boat.getWidth()/2) * boat.getWidth();
    }
}
