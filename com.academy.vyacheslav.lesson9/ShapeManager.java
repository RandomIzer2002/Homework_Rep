public class ShapeManager {

    public static double getLength(GeometricShape<?> shape) {
        return shape.getLength().doubleValue();
    }

    public static double getArea(GeometricShape<?> shape) {
        return shape.getArea();
    }

    public static double getVolume(GeometricShape<?> shape) {
        return shape.getVolume();
    }
}