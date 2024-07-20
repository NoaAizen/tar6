public class NoteDecorator extends PaperDecorator{
    /**
     * PaperDecorator Parameter Constructor
     *
     * @param paper is the object we wish to decorate
     */
    public NoteDecorator(Paper paper) {
        super(paper);
    }

    @Override
    public String write() {
        return super.write() + " Note";
    }
}
