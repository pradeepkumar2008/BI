package Array.Array_Level1;
import java.util.Scanner;
public class Odd_Even_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();
        if (number < 1)
        {
            System.err.println("Error: Please enter a natural number (1 or greater).");
            System.exit(0);
        }
        int[] evenNumbers = new int[number / 2 + 1];
        int[] oddNumbers = new int[number / 2 + 1];
        int evenIndex = 0;
        int oddIndex = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex] = i;
                evenIndex++;
            } else {
                oddNumbers[oddIndex] = i;
                oddIndex++;
            }
        }
        System.out.print("\nEven numbers array: ");
        for (int i = 0; i < evenIndex; i++)
        {
            System.out.print(evenNumbers[i] + " ");
        }
        System.out.print("\nOdd numbers array: ");
        for (int i = 0; i < oddIndex; i++)
        {
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println();
        input.close();
    }
}
