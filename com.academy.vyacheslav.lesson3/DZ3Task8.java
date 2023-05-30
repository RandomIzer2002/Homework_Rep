public class DZ3Task8 {
    public static void main(String[] args) {
        int[] vector = {1, 2, 3};
        int[][] matrix = { {1, 2, 3}, {4, 5, 6}};
        int[] result = multiplyMatrixByVector(matrix, vector);
        System.out.print("[ ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println("]");
    }

    public static int[] multiplyMatrixByVector(int[][] matrix, int[] vector) {
        int matrixRows = matrix.length;
        int matrixColumns = matrix[0].length;
        int vectorLeng = vector.length;
        if (matrixColumns == vectorLeng) {
            int[] result = new int[matrixRows];
            int sum = 0;
            for (int i = 0; i < matrixRows; i++) {
                for (int j = 0; j < matrixColumns; j++) {
                    sum += matrix[i][j] * vector[j];
                }
            result[i] = sum;
            sum = 0;
            }
            return result;
        } else {
            System.out.println("Невозможно умножить данную матрицу на вектор");
            return null;
        }
    }
}
