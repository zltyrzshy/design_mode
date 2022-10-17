package hm03.SimpleFactory_hw.SimpleFactory;

public class ShapeFactory {
    public static  Shape createShape(String shapename) throws UnsupportedShapeException {
        Shape shape = switch (shapename) {
            case "Circle" -> new Circle();
            case "Triangle" -> new Triangle();
            case "Rectangle" -> new Rectangle();
            default -> throw new UnsupportedShapeException("Shape does not exist");
        };
        return shape;
    }
}
