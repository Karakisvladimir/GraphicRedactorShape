package Shape;

public class Rectangle extends Shape implements Square {
    private int sideA;
    private int sideB;

    public Rectangle(String name, String color, int sideA, int sideB) {
        super(name, color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    @Override
    public double calculateSquare() {
        double result = sideA * sideB;
        return result;
    }

    @Override
    public void printColor() {
        System.out.println("Color is:" + getColor());
    }
}
