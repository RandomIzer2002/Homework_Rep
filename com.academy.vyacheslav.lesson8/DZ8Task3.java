public class DZ8Task3 {
    public static void main(String[] args) {
        System.out.println(replaceLetters(Constants.textBlock));

        printWords(replaceLetters(Constants.textBlock));
    }

    public static String replaceLetters(String text) {
        String[] words = text.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.length() < 4) {
                result.append(word).append(" ");
                continue;
            }
            
            StringBuilder temp = new StringBuilder(word);
            if (word.length() >= 7) {
                temp.setCharAt(6, '#');
            }
            temp.setCharAt(3, '#');
            result.append(temp).append(" ");
        }

        return result.toString().trim();
    }

    public static void printWords(String text) {
        String[] words = text.split(" ");
        for (String word : words) {
            if (word.matches("[b-df-hj-np-tv-zB-DF-HJ-NP-TV-Z].*[aeiouyAEIOUY]")) {
                System.out.println(word);
            }
        }
    }
}