import java.util.Scanner;
import java.lang.Math;

public class DZ1Task6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Введите первое число: ");
		int a = scanner.nextInt();
		System.out.print("Введите второе число: ");
		int b = scanner.nextInt();
		System.out.print("Введите третье число: ");
		int c = scanner.nextInt();
		int d = b * b - 4 * a * c;
		double x1 = (-b - Math.sqrt(1.0 * d)) / (2 * a);
		double x2 = (-b + Math.sqrt(1.0 * d)) / (2 * a);
		if (d == 0) {
			System.out.printf("Один корень: %.0f\n", x1);
		} else if (d < 0) {
			System.out.printf("Нет корней\n");
		} else if (x1 < x2) {
			System.out.printf("Два корня: %.0f %.0f\n", x1, x2);
		} else {
			System.out.printf("Два корня: %.0f %.0f\n ", x2, x1);
		}
		scanner.close();
	}

}
