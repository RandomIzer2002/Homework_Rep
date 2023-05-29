public class Triangle implements Shape {
    private double sideOne;
    private double sideTwo;
    private double sideThree;

    public Triangle(double sideOne, double sideTwo, double sideThree) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }

    public void setA(double sideOne) {
        this.sideOne = sideOne;
    }

    public void setB(double sideTwo) {
        this.sideTwo = sideTwo;
    }

    public void setC(double sideThree) {
        this.sideThree = sideThree;
    }

    public double getA() {
        return sideOne;
    }

    public double getB() {
        return sideTwo;
    }

    public double getC() {
        return sideThree;
    }

    @Override
    public double area() {
        double semiPerimeter = (sideOne + sideTwo + sideThree) / 2.0;
        return Math.sqrt(semiPerimeter * (semiPerimeter - sideOne) * (semiPerimeter - sideTwo) * (semiPerimeter - sideThree));
    }

    @Override
    public double perimeter() {
        return sideOne + sideTwo + sideThree;
    }
}