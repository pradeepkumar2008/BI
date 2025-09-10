import java.util.Scanner;

public class StringLengthWithoutLength {
    public static int customLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String text = sc.next();

        int custom = customLength(text);
        int builtIn = text.length();

        System.out.println("Custom Length: " + custom);
        System.out.println("Built-in Length: " + builtIn);
    }
}
