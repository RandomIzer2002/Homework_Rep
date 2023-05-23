public class Fraction {
	private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void print() {
        System.out.println(numerator + " / " + denominator);
    }

    public Fraction add(Fraction fraction) {
        int newNumerator = numerator * fraction.denominator + fraction.numerator * denominator;
        int newDenominator = denominator * fraction.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction multiply(int number) {
        return new Fraction(numerator * number, denominator);
    }

    public Fraction divide(int number) {
        return new Fraction(numerator, denominator * number);
    }
}