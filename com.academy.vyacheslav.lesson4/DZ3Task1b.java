import java.lang.Math;

public class DZ3Task1b {
	public static void main(String[] args) {
		functionExp();
	}

	public static void functionExp() {
		double a = 1.21;
		double b = 0.371;
		double y = Math.tan(Math.pow((a + b), 2)) - Math.cbrt(a + 1.5) + a * Math.pow(b, 5)
				- b / Math.log(Math.pow(a, 2));
		System.out.println("Ответ: " + y);
	}
}
