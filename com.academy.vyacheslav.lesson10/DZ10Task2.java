import java.util.Scanner;

public class DZ10Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("END")) {
                break;
            }

            try {
                double number = Double.parseDouble(input);
                sum += number;
                double root = Math.sqrt(sum);

                if (Double.isNaN(root)) {
                    throw new ArithmeticException("Невозможно вывести корень отрицательного числа");
                }

                System.out.printf("%.2f %.2f\n", number, root);
            } catch (NumberFormatException e) {
                System.out.println("Неверный числовой формат");
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }

        scanner.close();
    }
}
