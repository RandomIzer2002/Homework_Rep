public class DZ9Task4 {
    public static void main(String[] args) {
        Line<Integer> line = new Line<>(5);
        Rectangle2<Integer> rectangle = new Rectangle2<>(3, 4);
        Parallelepiped<Double> parallelepiped = new Parallelepiped<>(2.5, 3.5, 4.5);
        Cube<Integer> cube = new Cube<>(2);

        System.out.println(ShapeManager.getLength(line)); // 5.0
//        System.out.println(ShapeManager.getArea(line)); // IllegalArgumentException

        System.out.println(ShapeManager.getLength(rectangle)); // 7.0
        System.out.println(ShapeManager.getArea(rectangle)); // 12.0

        System.out.println(ShapeManager.getLength(parallelepiped)); // 12.5
        System.out.println(ShapeManager.getArea(parallelepiped)); // 68.0
        System.out.println(ShapeManager.getVolume(parallelepiped)); // 39.375

        System.out.println(ShapeManager.getLength(cube)); // 2.0
        System.out.println(ShapeManager.getArea(cube)); // 24.0
        System.out.println(ShapeManager.getVolume(cube)); // 8.0

        // changing cube length
        cube.setLength(3);
        System.out.println(ShapeManager.getLength(cube)); // 3.0
        System.out.println(ShapeManager.getArea(cube)); // 54.0
        System.out.println(ShapeManager.getVolume(cube)); // 27.0

        // changing cube height
        cube.setHeight(2);
        System.out.println(ShapeManager.getLength(cube)); // 3.0
        System.out.println(ShapeManager.getArea(cube)); // 18.0
        System.out.println(ShapeManager.getVolume(cube)); // 18.0
    }
}
