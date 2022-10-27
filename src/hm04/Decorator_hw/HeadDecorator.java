package hm04.Decorator_hw;

public class HeadDecorator extends Decorator {
    public HeadDecorator(Doc doc) {
        super(doc);
    }

    @Override
    public String getContent() {
        return "head\n" + doc.getContent();
    }
}
