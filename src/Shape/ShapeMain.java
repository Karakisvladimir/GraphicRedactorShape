package Shape;

public class ShapeMain {
    public static void main(String[] args) {
        Triangle shape = new Triangle("Triangle", "green", 4, 4, 4);
        //System.out.println("Площа трикутника дорівнює = " + shape.calculateSquare());
        Circle shape2 = new Circle("Circle", "yellow", 41.2);
        Printer.print(shape);
        FileShapePrinter.printFile(shape2);
//        shape2.printColor();
//        shape2.printShapeName();
//        System.out.println(shape2 + "\n" + " площа круга дорівнює = " + shape2.calculateSquare());
//        // змінюю праметри через Сеттери
//        shape.setSideA(9);
//        shape.setSideB(8);
//        shape.setSideC(5);
//
//        System.out.println("Нова площа трикутника дорівнює =  " + shape.calculateSquare());
//Printer.print(shape2);
//// Роблю масив с різними фігурами і находжу їх площину
//        Square[] squre = new Square[3];
//        squre[0] = new Circle("Circle", " green", 5);
//        squre[1] = new Triangle("Triangle", "Blue", 5, 5, 6);
//        squre[2] = new Rectangle("Rectangle", "Blue", 5, 6);
//        for (Square s : squre) {
//            System.out.println("Площина фігури дорівнює " + s.calculateSquare());
//        }
 }

}



