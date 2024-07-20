public class DiagramDecorator extends PaperDecorator{
    /**
     * PaperDecorator Parameter Constructor
     *
     * @param paper is the object we wish to decorate
     */
    public DiagramDecorator(Paper paper) {
        super(paper);
    }

    @Override
    public String write() {
        return super.write() + " Diagram";
    }
}
