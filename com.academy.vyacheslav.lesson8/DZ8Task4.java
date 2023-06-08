public class DZ8Task4 {
    public static void main(String[] args) {
        String text = "Listen to the news from today and read the text at the same time. Listen to the news from today without reading the text.";
        int uniqueWordsCount = Analyzer.countUniqueWords(text);
        System.out.println(uniqueWordsCount);
    }
}
