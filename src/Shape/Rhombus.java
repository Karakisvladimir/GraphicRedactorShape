package Shape;

public class Rhombus extends Shape implements Square{
private double diagonal1;
private double diagonal2;

    public Rhombus(String name, String color, double diagonal1, double diagonal2) {
        super(name, color);
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    public double getDiagonal1() {
        return diagonal1;
    }

    public void setDiagonal1(double diagonal1) {
        this.diagonal1 = diagonal1;
    }

    public double getDiagonal2() {
        return diagonal2;
    }

    public void setDiagonal2(double diagonal2) {
        this.diagonal2 = diagonal2;
    }

    @Override
    public double calculateSquare() {
        double result =(diagonal1*diagonal2)/2;
        return result;
    }
}
