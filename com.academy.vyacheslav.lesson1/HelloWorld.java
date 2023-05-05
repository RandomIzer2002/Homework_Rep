import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		consoleName();
	}

	public static void consoleName() {
		Scanner scanner = new Scanner(System.in);
		String inputName = scanner.nextLine();
		System.out.println("Hello " + inputName + "!");
		scanner.close();
	}
}