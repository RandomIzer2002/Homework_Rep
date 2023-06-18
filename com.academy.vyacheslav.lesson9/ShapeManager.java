public class ShapeManager {

    public static double getLength(GeometricShape<?> shape) { //если правильно задать параметризацию, то этот метод должен принимать только тип линии
        return shape.getLength().doubleValue();
    }

    public static double getArea(GeometricShape<?> shape) { //если правильно задать параметризацию, то этот метод должен принимать только типы линии и прямоугольника
        return shape.getArea();
    }

    public static double getVolume(GeometricShape<?> shape) {
        return shape.getVolume();
    }
}