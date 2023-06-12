public abstract class GeometricShape<T extends Number> {
    protected T length;

    public void setLength(T length) {
        this.length = length;
    }

    public T getLength() {
        return length;
    }

    public abstract double getPerimeter();

    public abstract double getArea();

    public abstract double getVolume();
}
