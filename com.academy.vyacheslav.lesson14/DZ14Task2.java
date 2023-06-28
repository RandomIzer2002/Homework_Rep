import java.io.*;
import java.util.*;

public class DZ14Task2 {
    public static void main(String[] args){
        String src1 = System.getProperty("user.dir") + "/com.academy.vyacheslav.lesson14/in1.txt";
        String src2 = System.getProperty("user.dir") + "/com.academy.vyacheslav.lesson14/in2.txt";
        String src3 = System.getProperty("user.dir") + "/com.academy.vyacheslav.lesson14/out.txt";
        String inputFile1 = src1;
        String inputFile2 = src2;
        String outputFile = src3;

        createInputFile(inputFile1, 1000);
        createInputFile(inputFile2, 1000);

        mergeFiles(inputFile1, inputFile2, outputFile);

        readOutputFile(outputFile);
    }

    public static void createInputFile(String filename, int count) {
        try (OutputStream outputStream = new FileOutputStream(filename);
             PrintWriter writer = new PrintWriter(outputStream)) {
            Random random = new Random();
            for (int i = 0; i < count; i++) {
                int number = random.nextInt(100000) + 1;
                writer.println(number);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void mergeFiles(String inputFile1, String inputFile2, String outputFile) {
        try (InputStream inputStream1 = new FileInputStream(inputFile1);
             InputStream inputStream2 = new FileInputStream(inputFile2);
             OutputStream outputStream = new FileOutputStream(outputFile);
             PrintWriter writer = new PrintWriter(outputStream)) {

            List<Integer> numbers = new ArrayList<>();

            readNumbersFromFile(inputStream1, numbers);
            readNumbersFromFile(inputStream2, numbers);

            Collections.sort(numbers);

            for (Integer number : numbers) {
                writer.println(number);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readNumbersFromFile(InputStream inputStream, List<Integer> numbers) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = reader.readLine()) != null) {
                int number = Integer.parseInt(line);
                numbers.add(number);
            }
        }
    }

    public static void readOutputFile(String outputFile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(outputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
