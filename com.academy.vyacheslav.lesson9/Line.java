public class Line<T extends Number> extends GeometricShape<T> {

    public Line(T length) {
        this.length = length;
    }

    @Override
    public double getPerimeter() {
        return length.doubleValue();
    }
}
