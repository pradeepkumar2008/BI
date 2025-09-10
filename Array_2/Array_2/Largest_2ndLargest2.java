package Array.Array_Level2;
import java.util.Scanner;
public class Largest_2ndLargest2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = input.nextLong();
        int maxDigits = 10;
        int[] digits = new int[maxDigits];
        int index = 0;
        long tempNumber = number;
        if (tempNumber == 0)
        {
            digits[index++] = 0;
        }
        while (tempNumber != 0)
        {
            if (index == maxDigits)
            {
                maxDigits += 10;
                int[] temp = new int[maxDigits];
                for (int i = 0; i < digits.length; i++)
                {
                    temp[i] = digits[i];
                }
                digits = temp;
            }
            digits[index] = (int)(tempNumber % 10);
            tempNumber /= 10;
            index++;
        }
        int largest = -1;
        int secondLargest = -1;
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
        System.out.println("Second largest digit: " + (secondLargest == -1 ? "Not found" : secondLargest));
        input.close();
    }
}
