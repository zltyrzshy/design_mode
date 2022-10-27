package hm04.Decorator_hw;

public class TailDecorator extends Decorator {

    public TailDecorator(Doc doc) {
        super(doc);
    }

    @Override
    public String getContent() {

        return doc.getContent() + "tail\n";
    }
}
