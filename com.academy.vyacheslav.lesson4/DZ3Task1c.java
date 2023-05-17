import java.lang.Math;

public class DZ3Task1c {
	public static void main(String[] args) {
		functionTab(12.1, -5, 3.75);
	}

	public static void functionTab(double x, double a, double aDelta) {
		while (a <= 12 && a >= -5) {
			System.out.println(Math.pow(2.72, a * x) - 3.45 * a);
			a += aDelta;
		}
	}
}
