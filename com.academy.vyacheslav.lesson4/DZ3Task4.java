import java.util.Arrays;

public class DZ3Task4 {
	public static void main(String[] args) {
		int[] arrae = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(arrae);
        System.out.println(Arrays.toString(arrae));

	}
		
	public static void bubbleSort(int[] arrSort) {
        for (int i = 0; i < arrSort.length - 1; i++) {
            for (int j = 0; j < arrSort.length - i - 1; j++) {
                if (arrSort[j] > arrSort[j + 1]) {
                    int tempElement = arrSort[j];
                    arrSort[j] = arrSort[j + 1];
                    arrSort[j + 1] = tempElement;
                }
            }
        }
    }
}