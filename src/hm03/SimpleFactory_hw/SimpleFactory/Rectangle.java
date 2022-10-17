package hm03.SimpleFactory_hw.SimpleFactory;

public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("draw"+this.getClass().getSimpleName());
    }

    @Override
    public void erase() {
        System.out.println("erase"+this.getClass().getSimpleName());
    }
}
