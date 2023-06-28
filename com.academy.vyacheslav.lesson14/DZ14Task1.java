import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class DZ14Task1 {
    public static void main(String[] args){
        String src = System.getProperty("user.dir") + "/com.academy.vyacheslav.lesson14/matrix.txt";
        int[][] matrix = generateMatrix(6, 4);
        writeMatrixToFile(src, matrix);
        readMatrixFromFile(src);
    }

    public static int[][] generateMatrix(int rows, int columns) {
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = (int) (Math.random() * 31) - 15;
            }
        }
        return matrix;
    }

    public static void writeMatrixToFile(String filename, int[][] matrix) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    writer.printf("%3d ", matrix[i][j]);
                }
                writer.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readMatrixFromFile(String filename) {
        try (java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
