package Array.Array_Level2;
import java.util.Scanner;
public class Largest_2ndLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = input.nextLong();
        int maxDigits = 10;
        int[] digits = new int[maxDigits];
        int index = 0;
        while (number != 0)
        {
            if (index == maxDigits)
            {
                System.out.println("Warning: Max digits (10) reached. Ignoring remaining digits.");
                break;
            }
            digits[index] = (int)(number % 10);
            number /= 10;
            index++;
        }
        int largest = 0;
        int secondLargest = 0;
        for (int i = 0; i < index; i++)
        {
            if (digits[i] > largest)
            {
                secondLargest = largest;
                largest = digits[i];
            }
            else if (digits[i] > secondLargest && digits[i] != largest)
            {
                secondLargest = digits[i];
            }
        }
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
        input.close();
    }
}
