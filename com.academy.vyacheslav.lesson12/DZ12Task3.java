import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class DZ12Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String input = scanner.nextLine().trim();
        scanner.close();

        System.out.println("Корректность расстановки скобок: " + isValid(input));
    }

    public static boolean isValid(String input) {
        Deque<Character> stack = new LinkedList<>();
        for (char c : input.toCharArray()) {
            switch (c) {
                case '(':
                case '[':
                case '{':
                    stack.push(c);
                    break;
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{') {
                        return false;
                    }
                    break;
            }
        }
        return stack.isEmpty();
    }
}
