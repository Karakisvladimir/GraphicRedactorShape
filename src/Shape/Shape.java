package Shape;

public class Shape {

   private String name;
    private String color;


    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Shape() {
    }

    public  void printShapeName(){
        System.out.println(name);
    }
   public void printColor(){

       System.out.println(color);
   }

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
        return "Shape is " + name +  "\n " +"Color is " + color ;
    }

}