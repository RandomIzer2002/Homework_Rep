public class DZ5Task2 {
    
    public static void main(String[] args){
        Fraction fracObjFirst = new Fraction(1, 2);
        Fraction fracObjSecond = new Fraction(1, 3);

        fracObjFirst.add(fracObjSecond).print();

        int number = 2;
        fracObjFirst.multiply(number).print();
        fracObjFirst.divide(number).print();
    }
}
