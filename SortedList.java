import java.util.*;

public class SortedList {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>(Arrays.asList(5, 3, 9, 1));

        System.out.println("Original Set: " + set);
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        System.out.println("Sorted List: " + list);
    }
}
