public class Fraction {
	int numerator;
	int denominator;

	public Fraction() {
		numerator = 10;
		denominator = 5;
	}

	public void fractionOuter() {
		System.out.println(numerator + " / " + denominator);
	}

	public int sumMethod(int numerator, int denominator) {
		return ((this.numerator / this.denominator) + (numerator / denominator));
	}

	public int multiMethod(int numerator, int denominator) {
		return ((this.numerator / this.denominator) * (numerator / denominator));
	}

	public int divMethod(int numerator, int denominator) {
		return ((this.numerator / this.denominator) / (numerator / denominator));
	}
}
