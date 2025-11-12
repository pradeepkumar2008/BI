public class SafeParser {
    
    public static int safeParseInt(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println("Parsing '123': " + safeParseInt("123"));
        System.out.println("Parsing 'abc': " + safeParseInt("abc"));
        System.out.println("Parsing '45.6': " + safeParseInt("45.6"));
        System.out.println("Parsing '0': " + safeParseInt("0"));
    }
}