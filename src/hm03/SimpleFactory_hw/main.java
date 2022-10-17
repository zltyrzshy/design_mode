package hm03.SimpleFactory_hw;

import hm03.SimpleFactory_hw.SimpleFactory.Shape;
import hm03.SimpleFactory_hw.SimpleFactory.ShapeFactory;

public class main {
    public static void main(String args[]) throws Exception{
        Shape circle = ShapeFactory.createShape("Circle");
        Shape rectangle = ShapeFactory.createShape("Rectangle");
        Shape triangle = ShapeFactory.createShape("Triangle");

        circle.draw();
        circle.erase();
        rectangle.draw();
        rectangle.erase();
        triangle.draw();
        triangle.erase();
    }
}
