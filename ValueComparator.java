public class ValueComparator {
    public static <T> boolean isEqual(T a, T b) {
        return a.equals(b);
    }

    public static void main(String[] args) {
        System.out.println("Comparing Integers: " + isEqual(10, 10));
        System.out.println("Comparing Strings: " + isEqual("Hello", "Hello"));
        System.out.println("Comparing Different Strings: " + isEqual("Hello", "World"));
    }
}