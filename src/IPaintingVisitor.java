public interface IPaintingVisitor {
//    PaintingVisitor() {}
    public void visit(Painting painting);
    public void visit(Island island);
    public void visit(Lake lake);
    public void visit(Flag flag);
    public void visit(Kite kite);
    public void visit(Kid kid);
    public void visit(Tree tree);
    public void visit(Boat boat);
}
