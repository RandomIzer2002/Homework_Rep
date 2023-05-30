import java.util.Arrays;
import java.util.Scanner;

public class DZ3Task4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(arrStr());
		System.out.print("Введите длину массива: ");
		int numArrayLeng = scanner.nextInt();
		int[] numArray = new int[numArrayLeng];
		System.out.println("Введите элементы массива: ");
		for(int i = 0; i < numArrayLeng; i++){
			int numArrayElement = scanner.nextInt();
			numArray[i] = numArrayElement;
		}
		arrNums(numArray);
		conditionArrNums(numArray);
		scanner.close();
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
		return Arrays.toString(arrae);
	}

	public static void arrNums(int[] numArray) {
		for (int i = 0; i < numArray.length; i++) {
			System.out.print(numArray[i] + " ");
		}
		System.out.println("");
	}

	public static void conditionArrNums(int[] numArray) {
		for (int i = 0; i < numArray.length; i++) {
			if (numArray[i] % 7 == 0) {
				continue;
			}
			System.out.print(numArray[i] + " ");
		}
	}
}