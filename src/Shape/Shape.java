package Shape;

public abstract class Shape {
    public String name;
    public String color;

    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public abstract void printColor();

    public abstract void printShapeName();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape is " + name + "\n " + "Color is " + color;
    }


}
