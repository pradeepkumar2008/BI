import java.util.*;

public class CheckSubset {
    public static void main(String[] args) {
    
        Set<Integer> set1 = new HashSet<>(Arrays.asList(2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4));

        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);

        boolean isSubset = set2.containsAll(set1);
        System.out.println("Set1 is a subset of Set2: " + isSubset);
    }
}
