public class DZ2Task2 {
	public static void main(String[] args) {
		String subseq = "0";
		for (int i = 1; i < 10; ++i) {
			subseq = subseq + i;
		}
		for (int i = 0; i < 10; ++i) {
			subseq = subseq + i + i;
		}
		for (int i = 0; i < 10; ++i) {
			subseq = subseq + i + i + i;
		}
		for (int i = 0; i < 10; ++i) {
			subseq = subseq + i + i + i + i;
		}
		System.out.println(subseq);
	}
}
