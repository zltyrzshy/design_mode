package hm04.Decorator_hw;

public abstract class Doc {

    public abstract String getContent();

    public void show() {
        System.out.println(getContent() + '\n');
    }
}
