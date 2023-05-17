import java.util.Scanner;

public class DZ1Task5 {

	// Fail

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Введите количество лет: ");
		int age = scanner.nextInt();
		if (age % 10 == 0 || (age % 10 >= 5 && age % 10 <= 20 || age % 100 >= 5 && age % 100 <= 20)) {
			System.out.println(age + " Лет");
		} else if (age % 10 == 1) {
			System.out.println(age + " Год");
		} else if (age % 10 >= 2 && age % 10 <= 4) {
			System.out.println(age + " Года");
		}
		scanner.close();
	}
}
