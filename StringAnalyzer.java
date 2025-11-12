import java.util.Scanner;

public class StringAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        int letters = 0;
        int digits = 0;
        int special = 0;

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                letters++;
            } else if (Character.isDigit(c)) {
                digits++;
            } else if (!Character.isWhitespace(c)) {
                special++;
            }
        }

        System.out.println("Total letters: " + letters);
        System.out.println("Total digits: " + digits);
        System.out.println("Total special characters: " + special);
    }
}