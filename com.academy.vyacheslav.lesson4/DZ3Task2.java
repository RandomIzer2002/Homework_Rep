import java.util.Scanner;

public class DZ3Task2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double numberOne = scanner.nextDouble();
		double numberTwo = scanner.nextDouble();
		System.out.println(recursedDivision(numberOne, numberTwo));
		scanner.close();
	}

	public static double recursedDivision(double numberOne, double numberTwo) {
		if (numberOne == 0 || numberTwo == 0) {
			System.out.print("Наибольший общий делитель: ");
			return numberOne + numberTwo;
		}
		if (numberOne > numberTwo) {
			numberOne = numberOne % numberTwo;
			System.out.println("Делитель №1: " + numberOne);
			return recursedDivision(numberOne, numberTwo);
		} else {
			numberTwo = numberTwo % numberOne;
			System.out.println("Делитель №2: " + numberTwo);
			return recursedDivision(numberOne, numberTwo);
		}
	}
}
