import java.lang.Math;

public class DZ3Task1a {
	public static void main(String[] args) {
		// Вариант записи по частям

		expression();

		// Вариант полной записи

		expressionFull();
	}

	public static void expression() {
		double a = 756.13;
		double x = 0.3;
		double firstPart = Math.cos(Math.pow((Math.pow(x, 2)) + (Math.PI / 6), 5));
		double secondPart = Math.sqrt(x * Math.pow(a, 3));
		double thirdPart = Math.log(Math.abs((a - 1.12 * x) / 4));
		double finalPart = firstPart - secondPart - thirdPart;
		System.out.println("Ответ: " + finalPart);
	}

	public static void expressionFull() {
		double a = 756.13;
		double x = 0.3;
		double z = Math.cos(Math.pow((Math.pow(x, 2)) + (Math.PI / 6), 5)) -
				Math.sqrt(x * Math.pow(a, 3))
				- Math.log(Math.abs((a - 1.12 * x) / 4));
		System.out.println("Ответ: " + z);
	}
}