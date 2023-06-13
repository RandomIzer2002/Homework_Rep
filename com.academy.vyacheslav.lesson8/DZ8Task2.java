import java.util.Scanner;

public class DZ8Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String str = scanner.nextLine();
        str = str.trim().replace("\\s+", " ");

        System.out.println("Нормированная строка: " + str);
        scanner.close();
    }
}
/*
Введите строку: dfgvfdsg      df g df g        df g dfg        dfg
Нормированная строка: dfgvfdsg      df g df g        df g dfg        dfg

мне выдало вот такой результат
 */