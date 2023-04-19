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

		// recursedDivision();

		// Задача №3

		fibonacci(0);
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

	/*
	 * public static void recursedDivision(int recNum) {
	 * Scanner sc = new Scanner(System.in);
	 * System.out.print("Введите первое число: ");
	 * int firstNum = sc.nextInt();
	 * System.out.print("Введите второе число: ");
	 * int secondNum = sc.nextInt();
	 * int commonDiv;
	 * if (firstNum % commonDiv == 0 && secondNum % commonDiv == 0){
	 * System.out.println("Общий делитель двух чисел: " + commonDiv);
	 * } else if (recNum)
	 * sc.close();
	 * }
	 */

	// Задача №3

	public static int fibonacci(int counter) {
		Scanner sc = new Scanner(System.in);
		int fibNum = sc.nextInt();
		if (counter == 0) {
			return 0;
		}
		System.out.println(counter);
		if (counter == 1) {
			return 1;
		} else {
			return fibonacci(counter - 1) + fibonacci(counter - 2);
		}
	}
}