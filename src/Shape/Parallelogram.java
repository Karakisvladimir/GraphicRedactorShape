package Shape;

public class Parallelogram extends Shape implements Square {
    private int sideA;
    private int hightParallelogram;

    public Parallelogram(String name, String color, int sideA, int hightParallelogram) {
        super(name, color);
        this.sideA = sideA;
        this.hightParallelogram = hightParallelogram;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public double getHightParallelogram() {
        return hightParallelogram;
    }

    public void setHightParallelogram(int hightParallelogram) {
        this.hightParallelogram = hightParallelogram;
    }

    @Override
    public double calculateSquare() {
        double result = sideA * hightParallelogram;
        return result;
    }

    @Override
    public void printShapeName() {
        System.out.println(" Shape is : " + getName());
    }

    @Override
    public void printColor() {
        System.out.println("Color is:" + getColor());
    }
}
