public class NumberChecker<T extends Number> {

    T number;

    public NumberChecker(T number) {
        this.number = number;
    }

    public boolean check(Number otherNumber) {
        return number.toString().length() == otherNumber.toString().length();
    }
}