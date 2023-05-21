import java.util.Arrays;

public class DZ3Task5 {

	/**
	 * Программа для вывода минимального и максимального чисел массивов.
	 * Для данных задач необходимо два метода,
	 * написанных и после вызваных ниже
	 * Оба метода работают по принципу сортировки массива
	 * и последующего вывода чисел:
	 * первое - минимальное, последнее - максимальное.
	 */

	public static void main(String[] args) {
		int[] arrae = {5, 12, 6, 8, 10, 15, 9, 14};
		minMethod(arrae);
		maxMethod(arrae);
	}

	public static void minMethod(int[] arrae) {
		Arrays.sort(arrae);
		System.out.println("Минимальное число в массиве: " + arrae[0]);
	}

	public static void maxMethod(int[] arrae) {
		Arrays.sort(arrae);
		System.out.println("Максимальное число в массиве: " + arrae[arrae.length - 1]);
	}
}