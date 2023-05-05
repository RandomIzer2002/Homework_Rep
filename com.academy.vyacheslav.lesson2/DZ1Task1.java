import java.util.Scanner;

public class DZ1Task1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Введите первое число: ");
		int firstNum = scanner.nextInt();
		System.out.print("Введите второе число: ");
		int secondNum = scanner.nextInt();
		int sum = firstNum + secondNum;
		System.out.println("Сумма введённых чисел равна: " + sum);
		String convertedSum = Integer.toBinaryString(sum);
		System.out.println("Сумма чисел в двоичной системе равна: " + convertedSum);
		convertedSum = Integer.toOctalString(sum);
		System.out.println("Сумма чисел в восьмеричной системе равна: " + convertedSum);
		convertedSum = Integer.toHexString(sum);
		System.out.println("Сумма чисел в шестнацатеричной системе равна: " + convertedSum);
		scanner.close();
	}
}
