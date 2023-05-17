import java.util.Scanner;

public class DZ3Task3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int counter = scanner.nextInt();
		System.out.println("Конечное число: " + fibonachi(counter));
		scanner.close();
	}

	public static int fibonachi(int counter) {
		if (counter == 0) {
			return 0;
		}
		if (counter == 1) {
			return 1;
		} else {
			return fibonachi(counter - 1) + fibonachi(counter - 2);
		}
	}
}