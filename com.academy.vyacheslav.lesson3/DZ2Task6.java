import java.util.Scanner;
import java.util.Arrays;

public class DZ2Task6 {

	public static void main(String[] args) {
		minMethod();
		maxMethod();
	}

	public static void minMethod() {
		Scanner scanner = new Scanner(System.in);
		int[] minArray = new int[8];
		System.out.println("Введите элементы первого массива:");
		for (int i = 0; i < minArray.length; i++) {
			minArray[i] = scanner.nextInt();
		}
		Arrays.sort(minArray);
		System.out.println("Минимальное значение второго массива: " + minArray[0]);
	}

	public static void maxMethod() {
		Scanner scanner = new Scanner(System.in);
		int[] maxArray = new int[8];
		System.out.println("Введите элементы второго массива:");
		for (int i = 0; i < maxArray.length; i++) {
			maxArray[i] = scanner.nextInt();
		}
		Arrays.sort(maxArray);
		System.out.println("Максимальное значение второго массива: " + maxArray[maxArray.length - 1]);
	}
}
