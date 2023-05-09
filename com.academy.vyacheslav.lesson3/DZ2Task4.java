import java.util.Arrays;
import java.util.Scanner;

public class DZ2Task4 {
	public static void main(String[] args) {
		System.out.println(arrStr());
		arrNums();
		conditionArrNums();
	}

	public static String arrStr() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Введите элементы массива через пробел: ");
		String strNums = scanner.nextLine();
		String[] strArrNums = strNums.split(" ");
		int[] arrae = new int[strArrNums.length];
		for (int i = 0; i < arrae.length; i++) {
			arrae[i] = Integer.valueOf(strArrNums[i]);
		}

		// Вариант перебора строки и присвоения её элементов массиву через цикл for
		// (fail)

		/*
		 * if (arrSize < arrChars.length() / 2 + 1) {
		 * String[] correctArrae = new String[strNums.length() / 2 + 1];
		 * for (int i = 1; i <= strNums.length() / 2 + 1; i++) {
		 * for (int j = 0; j < correctArrae.length; j++) {
		 * correctArrae[j] = strNums;
		 * }
		 * }
		 * }
		 * for (int n = 1; n <= strNums.length() / 2 + 1; n++) {
		 * for (int h = 0; h < arrae.length; h++) {
		 * arrae[h] = strNums;
		 * }
		 * }
		 */

		scanner.close();
		return Arrays.toString(arrae);
	}

	public static void arrNums() {
		int[] numArray = { 21, 1, 6, 14, 5, 11, 9, 7, 8 };
		for (int i = 0; i < numArray.length; i++) {
			System.out.print(numArray[i] + " ");
		}
		System.out.println("");
	}

	public static void conditionArrNums() {
		int[] numArray = { 21, 1, 6, 14, 5, 11, 9, 7, 8 };
		for (int i = 0; i < numArray.length; i++) {
			if (numArray[i] % 7 == 0) {
				continue;
			}
			System.out.print(numArray[i] + " ");
		}
	}
}