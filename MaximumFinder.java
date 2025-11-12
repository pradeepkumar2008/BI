public class MaximumFinder {
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Maximum of 3, 7, 2: " + maximum(3, 7, 2));
        System.out.println("Maximum of 3.5, 1.2, 8.7: " + maximum(3.5, 1.2, 8.7));
        System.out.println("Maximum of apple, banana, orange: " + maximum("apple", "banana", "orange"));
    }
}