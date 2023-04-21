import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class Homework2 {
	public static void main(String[] args) {

		// Задача №1a

		// Вариант записи по частям

		// expression();

		// Вариант полной записи

		// expressionFull();

		// Задача №1b

		// functionExp();

		// Задача №1c

		// Задача №2

		// System.out.println(recursedDivision(15, 9));

		// Задача №3

		// System.out.println(fibonachi(8));

		// Задача №4

	}

	// Задача №1a

	public static void expression() {
		double a = 756.13;
		double x = 0.3;
		double firstPart = Math.cos(Math.pow((Math.pow(x, 2)) + (Math.PI / 6), 5));
		double secondPart = Math.sqrt(x * Math.pow(a, 3));
		double thirdPart = Math.log(Math.abs((a - 1.12 * x) / 4));
		double finalPart = firstPart - secondPart - thirdPart;
		System.out.println("Ответ: " + finalPart);
	}

	// Вариант полной записи

	public static void expressionFull() {
		double a = 756.13;
		double x = 0.3;
		double z = Math.cos(Math.pow((Math.pow(x, 2)) + (Math.PI / 6), 5)) -
				Math.sqrt(x * Math.pow(a, 3))
				- Math.log(Math.abs((a - 1.12 * x) / 4));
		System.out.println("Ответ: " + z);
	}

	// Задача №1b

	public static void functionExp() {
		double a = 1.21;
		double b = 0.371;
		double y = Math.tan(Math.pow((a + b), 2)) - Math.cbrt(a + 1.5) + a * Math.pow(b, 5)
				- b / Math.log(Math.pow(a, 2));
		System.out.println("Ответ: " + y);
	}

	// Задача №1c

	public static void functionTab() {

	}

	// Задача №2

	public static double recursedDivision(double numberOne, double numberTwo) {
		if (numberOne == 0 || numberTwo == 0) {
			return numberOne + numberTwo;
		}
		if (numberOne > numberTwo) {
			numberOne = numberOne % numberTwo;
		} else {
			numberTwo = numberTwo % numberOne;
		}
		return recursedDivision(numberOne, numberTwo);
	}

	// Задача №3

	public static int fibonachi(int counter) {
		if (counter == 0) {
			return 0;
		}
		if (counter == 1) {
			return 1;
		} else {
			return fibonachi(counter - 1) + fibonachi(counter - 2);
		}
	}

	// Задача №4

	public static void bubbleSort(int[] array) {
		boolean sortTrueness = false;
		int temp;
		while (!sortTrueness) {
			sortTrueness = true;
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					sortTrueness = false;
				}
			}
		}
	}
}