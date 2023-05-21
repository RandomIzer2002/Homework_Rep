import java.util.Scanner;
import java.util.Arrays;

public class DZ3Task6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Введите длину массива: ");
		int arraeLeng = scanner.nextInt();
		int[] arrae = new int[arraeLeng];
		System.out.println("Введите элементы массива: ");
		for(int i = 0; i < arraeLeng; i++){
			int numArrayElement = scanner.nextInt();
			arrae[i] = numArrayElement;
		}
		minMethod(arrae);
		maxMethod(arrae);
		scanner.close();
	}

	public static void minMethod(int[] arrae) {
		Arrays.sort(arrae);
		System.out.println("Минимальное значение второго массива: " + arrae[0]);
	}

	public static void maxMethod(int[] arrae) {
		Arrays.sort(arrae);
		System.out.println("Максимальное значение второго массива: " + arrae[arrae.length - 1]);
	}
}
