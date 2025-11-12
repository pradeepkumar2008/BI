import java.util.*;

public class SymmetricDifference {
    public static void main(String[] args) {
        // Step 1: Create two sets
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);
        Set<Integer> symDiff = new HashSet<>(set1); 
        symDiff.addAll(set2); 

        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2); 

        symDiff.removeAll(intersection);
        System.out.println("Symmetric Difference: " + symDiff);
    }
}
