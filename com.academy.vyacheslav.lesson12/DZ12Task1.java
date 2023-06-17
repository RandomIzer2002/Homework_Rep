import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Arrays;

public class DZ12Task1 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7);

        Set<Integer> set1 = new HashSet<>(list1);
        Set<Integer> set2 = new TreeSet<>(list2);

        Set<Integer> cross = getCross(set1, set2);
        Set<Integer> union = getUnion(set1, set2);

        System.out.println("Пересечение множеств: " + cross);
        System.out.println("Объединение множеств: " + union);
    }

    public static <T> Set<T> getCross(Set<T> set1, Set<T> set2) {
        Set<T> cross = new HashSet<>(set1);
        cross.retainAll(set2);
        return cross;
    }

    public static <T> Set<T> getUnion(Set<T> set1, Set<T> set2) {
        Set<T> union = new HashSet<>(set1);
        union.addAll(set2);
        return union;
    }
}
