public class Cube<T extends Number> extends Parallelepiped<T> {

    public Cube(T length) {
        super(length, length, length);
    }

    @Override
    public void setLength(T length) {
        this.length = length;
        this.width = length;
        this.height = length;
    }

    @Override
    public void setWidth(T width) {
        setLength(width);
    }

    @Override
    public void setHeight(T height) {
        setLength(height);
    }

}
