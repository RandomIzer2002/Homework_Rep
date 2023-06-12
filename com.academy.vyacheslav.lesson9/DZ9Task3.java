public class DZ9Task3 {
    public static void main(String[] args) {
        NumberChecker<Integer> integerNumberChecker = new NumberChecker<>(123);
        System.out.println(integerNumberChecker.check(45678));
        System.out.println(integerNumberChecker.check(789));

        NumberChecker<Double> doubleNumberChecker = new NumberChecker<>(123.456);
        System.out.println(doubleNumberChecker.check(456.7));
        System.out.println(doubleNumberChecker.check(789.012));
    }
}
