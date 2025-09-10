package Array.Array_Level1;
import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
        if (number <= 0)
        {
            System.out.println("Please enter a positive integer.");
            return;
        }
        String[] results = new String[number];
        for (int i = 1; i <= number; i++)
        {
            if (i % 3 == 0 && i % 5 == 0)
            {
                results[i - 1] = "Array.Array_Level_1.FizzBuzz";
            }
            else if (i % 3 == 0)
            {
                results[i - 1] = "Fizz";
            }
            else if (i % 5 == 0)
            {
                results[i - 1] = "Buzz";
            }
            else
            {
                results[i - 1] = Integer.toString(i);
            }
        }
        System.out.println("\n--- Array.Array_Level_1.FizzBuzz Results ---");
        for (int i = 0; i < results.length; i++)
        {
            System.out.println("Position " + (i + 1) + " = " + results[i]);
        }
        input.close();
    }
}
