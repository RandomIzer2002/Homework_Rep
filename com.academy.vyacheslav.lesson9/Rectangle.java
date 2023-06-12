public class Rectangle<T extends Number> extends Line<T> {

    protected T width;

    public Rectangle(T length, T width) {
        super(length);
        this.width = width;
    }

    public void setWidth(T width) {
        this.width = width;
    }

    public T getWidth() {
        return width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length.doubleValue() + width.doubleValue());
    }

    @Override
    public double getArea() {
        return length.doubleValue() * width.doubleValue();
    }

    @Override
    public double getVolume() {
        throw new IllegalArgumentException("Невозможно посчитать значение 2D фигуры");
    }

}