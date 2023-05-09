import java.util.Arrays;

public class DZ2Task5 {

	/**
	 * Программа для вывода минимального и максимального чисел массивов.
	 * Для данных задач необходимо два метода,
	 * написанных и после вызваных ниже
	 * Оба метода работают по принципу сортировки массива
	 * и последующего вывода чисел:
	 * первое - минимальное, последнее - максимальное.
	 */

	public static void main(String[] args) {
		minMethod();
		maxMethod();
	}

	public static void minMethod() {
		int[] minArray = { 10, 5, 3, 7, 1, 12, 13, 9 };
		Arrays.sort(minArray);
		System.out.println(minArray[0]);
	}

	public static void maxMethod() {
		int[] maxArray = { 10, 5, 3, 7, 1, 12, 13, 9 };
		Arrays.sort(maxArray);
		System.out.println(maxArray[maxArray.length - 1]);
	}
}