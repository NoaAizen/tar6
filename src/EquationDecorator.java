public class EquationDecorator extends PaperDecorator {
    /**
     * PaperDecorator Parameter Constructor
     *
     * @param paper is the object we wish to decorate
     */
    public EquationDecorator(Paper paper) {
        super(paper);
    }

    @Override
    public String write() {
        return super.write() + " Equation";
    }
}
