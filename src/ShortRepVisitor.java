public class ShortRepVisitor implements IPaintingVisitor {

    /**
     * @param painting
     */
    @Override
    public void visit(Painting painting) {

    }

    /**
     * @param island
     */
    @Override
    public void visit(Island island) {
        System.out.println(island.getFullName());
    }

    /**
     * @param lake
     */
    @Override
    public void visit(Lake lake) {
        System.out.println(lake.getFullName());
    }

    /**
     * @param flag
     */
    @Override
    public void visit(Flag flag) {
        System.out.println(flag.getFullName());
    }

    /**
     * @param kite
     */
    @Override
    public void visit(Kite kite) {
        System.out.println(kite.getFullName());
    }

    /**
     * @param kid
     */
    @Override
    public void visit(Kid kid) {
        System.out.println(kid.getFullName());
    }

    /**
     * @param tree
     */
    @Override
    public void visit(Tree tree) {
        System.out.println(tree.getFullName());
    }

    /**
     * @param boat
     */
    @Override
    public void visit(Boat boat) {
        System.out.println(boat.getFullName());
    }
}
