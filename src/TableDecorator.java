public class TableDecorator extends PaperDecorator{
    /**
     * PaperDecorator Parameter Constructor
     *
     * @param paper is the object we wish to decorate
     */
    public TableDecorator(Paper paper) {
        super(paper);
    }

    @Override
    public String write() {
        return super.write() + " Table";
    }
}
