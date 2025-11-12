import java.util.*;

public class CollectionUtility {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(18, 42, 9, 73, 27, 61));

        Collections.sort(numbers);
        System.out.println("Sorted list: " + numbers);

        Collections.reverse(numbers);
        System.out.println("Reversed list: " + numbers);

        int max = Collections.max(numbers);
        int min = Collections.min(numbers);

        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);
    }
}
