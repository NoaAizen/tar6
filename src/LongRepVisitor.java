public class LongRepVisitor implements IPaintingVisitor {
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
        System.out.print("An ");
        if (island.children.isEmpty()) {
            System.out.print("empty island named " + island.getName() + ". ");
        } else {
            System.out.print("island named " + island.getName() + " containing: ");
        }
    }

    /**
     * @param lake
     */
    @Override
    public void visit(Lake lake) {
//        System.out.print("An ");
        if (lake.children.isEmpty()) {
            System.out.print("An empty lake named " + lake.getName() + ". ");
        } else {
            System.out.print("A lake named " + lake.getName() + " containing: ");
        }
    }

    /**
     * @param flag
     */
    @Override
    public void visit(Flag flag) {
        System.out.print("A flag with color: " + flag.getColor().toString().toLowerCase()  + " of height " + flag.getCarrierHeight() + ". ");
    }

    /**
     * @param kite
     */
    @Override
    public void visit(Kite kite) {
        System.out.print("A kite of color: " + kite.getColor().toString().toLowerCase()  + ". ");
    }

    /**
     * @param kid
     */
    @Override
    public void visit(Kid kid) {
        System.out.print("A " + (2024-kid.getBirthYear()) + " year old kid with " + kid.getHairColor().toString().toLowerCase() + " hair. ");
    }

    /**
     * @param tree
     */
    @Override
    public void visit(Tree tree) {
        System.out.print("A tree with an amount of " + tree.getLeavesAmount() + " leaves. ");
    }

    /**
     * @param boat
     */
    @Override
    public void visit(Boat boat) {
        System.out.print("A boat made of " + boat.getMaterial().toString().toLowerCase()  + " material. ");
    }
}
