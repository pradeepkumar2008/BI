package Array.Array_Level1;
import java.util.Scanner;
public class Sum_OF_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;
        System.out.println("Enter up to 10 numbers:");
        while (true)
        {
            if (index == 10)
            {
                System.out.println("Enter ten numbers: ");
                break;
            }
            System.out.print("Enter number " + (index + 1) + ": ");
            double userEntry = input.nextDouble();
            if (userEntry <= 0)
            {
                break;
            }
            numbers[index] = userEntry;
            index++;
        }
        System.out.print("Entered numbers are: ");
        for (int i = 0; i < index; i++)
        {
            System.out.print(numbers[i] + " ");
            total += numbers[i];
        }
        System.out.println("Sum of the numbers: " + total);
    }
}
