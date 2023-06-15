public class Line<T extends Number> extends GeometricShape<T> {

    public Line(T length) {
        this.length = length;
    }

    @Override
    public double getPerimeter() {
        return length.doubleValue();
    }

    @Override
    public double getArea() {
        throw new IllegalArgumentException("Невозможно посчитать площадь линии"); //не верный подход. метод getArea в принципе не должен вызываться у линии
    }

    @Override
    public double getVolume() {
        throw new IllegalArgumentException("Невозможно посчитать значение линии");//не верный подход. метод getVolume в принципе не должен вызываться ни у линии, ни у прямоугольника
    }
}