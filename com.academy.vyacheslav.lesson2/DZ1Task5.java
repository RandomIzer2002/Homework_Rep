import java.util.Scanner;

public class DZ1Task5 {

	// Fail
	//при вводе значния 22 программа вывела "22 Лет".
	//при вводе значния 12 программа вывела "12 Года".
	// в общем нужно исправить и проверить еще раз на различных значениях

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Введите количество лет: ");
		int age = scanner.nextInt();
		if (age % 10 == 0 || (age % 10 >= 5 && age % 10 <= 9 || age % 11 == 0)) {
			System.out.println(age + " Лет");
		} else if (age % 10 == 1) {
			System.out.println(age + " Год");
		} else if (age % 10 >= 2 && age % 10 <= 4) {
			System.out.println(age + " Года");
		}
		scanner.close();
	}
}
