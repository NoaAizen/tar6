/**
 * A Factory Class
 * It will create the appropriate decorator for our page
 */
public class PaperElementFactory {
    /**
     * Factory - Will create appropriate decorator
     * @param p is the paper element that is requesting a decorator
     * @param choice is the name of which decorator we must use
     * @return the updated paper + decorator
     */
    public static Paper createPaperElementDecorator(Paper p, String choice) {
        switch (choice) {
            case "tb":
                p = new TableDecorator(p);
                break;
            case "eq":
                p = new EquationDecorator(p);
                break;
            case "d":
                p = new DiagramDecorator(p);
                break;
            case "nt":
                p = new NoteDecorator(p);
                break;
            default:
                throw new RuntimeException("wrong PaperType");
        }
        return p;
    }
}
