package Array.Array_Level2;
import java.util.Scanner;
public class Frequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = input.nextLong();
        if (number < 0)
        {
            number = -number;
        }
        int[] frequency = new int[10];
        String numStr = Long.toString(number);
        for (char c : numStr.toCharArray())
        {
            int digit = c - '0';
            frequency[digit]++;
        }
        System.out.println("\n--- Digit Frequency ---");
        for (int i = 0; i < 10; i++)
        {
            if (frequency[i] > 0)
            {
                System.out.println("Frequency of " + i + ": " + frequency[i]);
            }
        }
        input.close();
    }
}
