public class DZ3Task7 {
	public static void main(String[] args) {
		int[][] matrix = { { 1, 3, 5 }, { 2, 4, 6 }, { 7, 8, 9 }, { 2, 5, 10 } };
		maxMatrixElem(matrix);
	}

	public static void maxMatrixElem(int[][] matrix){
		int matrixSum1 = 0;
		int matrixSum2 = 0;
		int matrixIndex = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrixSum1 += matrix[i][j];
			}
			if (matrixSum1 > matrixSum2) {
				matrixSum2 = matrixSum1;
				matrixIndex = i;
			}
			matrixSum1 = 0;
		}
		System.out.println("Сумма: " + matrixSum2 + " Индекс: " + matrixIndex);
	}
}
