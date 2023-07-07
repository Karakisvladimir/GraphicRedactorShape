package Shape;

public class Circle extends Shape implements Square {
    private double radius;

    @Override
    public void printColor() {
        System.out.println("Color is: " + getColor());
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getColor() {
        return color;
    }


    public Circle(String name, String color, double radius) {
        super(name, color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateSquare() {
        double result = 3 * radius * Math.PI;
        return result;
    }
}
