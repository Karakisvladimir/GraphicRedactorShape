package Shape;

public class ConsoleShapePrinter extends Shape{


    public ConsoleShapePrinter(String name, String color) {
        super(name, color);
    }

    public  String printShape(Shape shape) {
        return shape.getName();
    }

}

