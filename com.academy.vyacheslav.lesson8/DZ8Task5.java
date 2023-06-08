import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DZ8Task5 {
    public static void main(String[] args){
        String text = "+123456789012345 Some text with +987654321 1234 5678901 +12345";
        printValidPhones(text);
    }

    public static void printValidPhones(String text) {
        Pattern pattern = Pattern.compile("\\+\\d{9,14}");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
