import java.util.HashSet;
import java.util.Set;

public class Analyzer {
    public static int countUniqueWords(String text) {
        // удаляем знаки препинания и лишние пробелы
        text = text.replaceAll("[^a-zA-Zа-яА-Я0-9 ]", "").trim();
        // разбиваем текст на слова и добавляем их в множество
        String[] words = text.split("\\s+");
        Set<String> uniqueWords = new HashSet<>();
        for (String word : words) {
            uniqueWords.add(word.toLowerCase());
        }
        return uniqueWords.size();
    }
}
