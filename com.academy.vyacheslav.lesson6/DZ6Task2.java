public class DZ6Task2 {
    public static void main(String[] args){
        Rectangle rect = new Rectangle(5, 10);
        Circle cir = new Circle(5);
        Triangle tri = new Triangle(3, 4, 5);
        ShapeParameterPrinter printer = new ShapeParameterPrinter();
        printer.printArea(rect);
        printer.printPerimeter(cir);
        printer.printAll(tri);
    }
}
