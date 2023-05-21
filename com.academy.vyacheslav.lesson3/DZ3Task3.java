import java.util.Scanner;

public class DZ3Task3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Создайте пароль: ");
		String passwordCreate = scanner.nextLine();
		System.out.print("Введите пароль: ");
		String password = scanner.nextLine();
		int i = 0;
		do {
			i++;
			if (password.equals(passwordCreate)) {
			System.out.println("Пароль введён верно, добро пожаловать!");
		} else {
			i = 0;
			System.out.print("Неверный пароль! Пожалуйста, повторите попытку: ");
			password = scanner.nextLine();
		}
	} while (i < 2);
		scanner.close();
	}
}
