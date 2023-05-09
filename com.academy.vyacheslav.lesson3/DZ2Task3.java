import java.util.Scanner;

public class DZ2Task3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Создайте пароль: ");
		String passwordCreate = scanner.nextLine();
		System.out.print("Введите пароль: ");
		String password = scanner.nextLine();
		for (int i = 0; i < 2; i++) {
			if (password.equals(passwordCreate)) {
				System.out.println("Пароль введён правильно, добро пожаловать!");
			} else {
				i = 0;
				System.out.print("Неверный пароль! Попробуйте ещё раз: ");
				password = scanner.nextLine();
			}
		}
		scanner.close();
	}
}
