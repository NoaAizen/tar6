public class CountingVisitor implements IPaintingVisitor {
    private int count = 0;
    public int getCount() { return count; }

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
        count+=1;
    }

    /**
     * @param lake
     */
    @Override
    public void visit(Lake lake) {
        count+=1;
    }

    /**
     * @param flag
     */
    @Override
    public void visit(Flag flag) {
        count+=1;
    }

    /**
     * @param kite
     */
    @Override
    public void visit(Kite kite) {
        count+=1;
    }

    /**
     * @param kid
     */
    @Override
    public void visit(Kid kid) {
        count+=1;
    }

    /**
     * @param tree
     */
    @Override
    public void visit(Tree tree) {
        count+=1;
    }

    /**
     * @param boat
     */
    @Override
    public void visit(Boat boat) {
        count+=1;
    }
}
