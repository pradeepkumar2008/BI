// File: SecurityUtils.java
interface SecurityUtils {
    // Static method to validate password strength
    static boolean isStrongPassword(String password) {
        // Password policy: At least 8 chars, contains upper, lower, digit, special char
        return password.length() >= 8 &&
               password.matches(".*[A-Z].*") &&
               password.matches(".*[a-z].*") &&
               password.matches(".*\\d.*") &&
               password.matches(".*[@#$%^&+=!].*");
    }
}

public class SecurityTest {
    public static void main(String[] args) {
        String password = "Lyric@2025";

        if (SecurityUtils.isStrongPassword(password)) {
            System.out.println("✅ Strong password!");
        } else {
            System.out.println("❌ Weak password. Please follow policy rules.");
        }
    }
}
