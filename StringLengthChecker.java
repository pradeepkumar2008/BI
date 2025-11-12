// File: StringLengthChecker.java
import java.util.function.Function;

public class StringLengthChecker {
    public static void main(String[] args) {
        int limit = 20;

        // Function returns the length of a given string
        Function<String, Integer> getLength = str -> str.length();

        String message = "This is a long message for testing.";

        int length = getLength.apply(message);

        System.out.println("Message length: " + length);
        if (length > limit) {
            System.out.println("⚠️ Message exceeds the character limit!");
        } else {
            System.out.println("✅ Message within the limit.");
        }
    }
}
