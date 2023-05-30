import java.util.Scanner;

public class DZ3Task3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Создайте пароль: ");
		String passwordCreate = scanner.nextLine();
		System.out.print("Введите пароль: ");
		String password = scanner.nextLine();
		do {
			System.out.print("Неверный пароль! Пожалуйста, повторите попытку: ");
			password = scanner.nextLine();
	} while (!(password.equals(passwordCreate)));
	System.out.println("Пароль введён верно, добро пожаловать!");
		scanner.close();
	}
}