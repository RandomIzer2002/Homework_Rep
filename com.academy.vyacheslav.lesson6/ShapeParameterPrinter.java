public class ShapeParameterPrinter {
    public void printArea(Shape shape) {
        System.out.println("Площадь: " + shape.area());
    }

    public void printPerimeter(Shape shape) {
        System.out.println("Периметр: " + shape.perimeter());
    }

    public void printAll(Shape shape) {
        System.out.println("Площадь: " + shape.area());
        System.out.println("Периметр: " + shape.perimeter());
    }
}