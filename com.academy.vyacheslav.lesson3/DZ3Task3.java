import java.util.Scanner;

public class DZ3Task3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Создайте пароль: ");
		String passwordCreate = scanner.nextLine();
		System.out.print("Введите пароль: ");
		String password = scanner.nextLine();
		int i = 0; // эта переменная не нужна вобще
		do {
			i++;
			if (password.equals(passwordCreate)) { // данное условие должно проверяться в операторе while(условие)
			System.out.println("Пароль введён верно, добро пожаловать!"); // эта строчка должна быть после цикла do while
		} else {
			i = 0;
			System.out.print("Неверный пароль! Пожалуйста, повторите попытку: ");
			password = scanner.nextLine();
		}
	} while (i < 2); //помести условие проверки равенства пароля сюда и тогда тебе не понадобится ни блок if ни переменная i
		scanner.close();
	}
}
