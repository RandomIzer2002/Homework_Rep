import java.util.*;

public class DZ12Task2 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите слова. Для окончания введите слово \"end\"");
        while (true) {
            String word = scanner.nextLine().trim().toLowerCase();
            if (word.equals("end")) {
                break;
            }
            words.add(word);
        }

        Map<String, Integer> map = listToMap(words);

        System.out.println("Содержимое карты:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }

        scanner.close();
    }

    public static <K> Map<K, Integer> listToMap(List<K> ks) {
        Map<K, Integer> map = new HashMap<>();
        for (K k : ks) {
            if (map.containsKey(k)) {
                map.put(k, map.get(k) + 1);
            } else {
                map.put(k, 1);
            }
        }
        return map;
    }
}
