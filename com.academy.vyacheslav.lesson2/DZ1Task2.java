import java.util.Scanner;

public class DZ1Task2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Введите проверяемое число: ");
		int num = scanner.nextInt();
		if (num % 2 == 0) {
			System.out.println("Введённое число - чётное!");
		} else {
			System.out.println("Введённое число - нечётное!");
		}
		scanner.close();
	}
}
