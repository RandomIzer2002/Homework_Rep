import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DZ14Task3 {
    public static void main(String[] args) {
        String src4 = System.getProperty("user.dir") + "/com.academy.vyacheslav.lesson14/input.txt";
        String src5 = System.getProperty("user.dir") + "/com.academy.vyacheslav.lesson14/occurrences.txt";
        String inputFile = src4;
        String outputFile = src5;

        int count = countOccurrences(inputFile);
        writeOccurrences(outputFile, count);
    }

    private static int countOccurrences(String inputFile) {
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                count += line.length() - line.replace("a", "").length();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }

    private static void writeOccurrences(String outputFile, int count) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            writer.write(String.valueOf(count));
            System.out.println("Number of occurrences of 'a': " + count);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error occurred while reading occurrences.txt");
        }
    }
}
