public class Parallelepiped<T extends Number> extends Rectangle2<T> {

    protected T height;

    public Parallelepiped(T length, T width, T height) {
        super(length, width);
        this.height = height;
    }

    public void setHeight(T height) {
        this.height = height;
    }

    public T getHeight() {
        return height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length.doubleValue() + width.doubleValue());
    }

    @Override
    public double getArea() {
        return 2 * (length.doubleValue() * width.doubleValue() + length.doubleValue() * height.doubleValue() + width.doubleValue() * height.doubleValue());
    }

    @Override
    public double getVolume() {
        return length.doubleValue() * width.doubleValue() * height.doubleValue();
    }

}
