public abstract class PaperDecorator implements Paper {
    /**
     * The Component we wish to decorate
     */
    protected Paper itsPaper;
    /**
     * PaperDecorator Parameter Constructor
     * @param paper is the object we wish to decorate
     */
    public PaperDecorator(Paper paper) {
        this.itsPaper = paper;
    }

    @Override
    public String write() {
        return itsPaper.write();
    }
}
