package Shape;

public class Triangle extends Shape implements Square {
    private double sideA;
    private double sideB;
    private double sideC;


    public double getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }


    public Triangle(String name, String color, int sideA, int sideB, int sideC) {
        super(name, color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;

    }

    @Override
    public double calculateSquare() {
        //формула Герона
        double p = (sideA + sideB + sideC) / 2;
        double result = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
        return result;
    }


    @Override
    public void printColor() {
        System.out.println("Color is:" + getColor());
    }
}
