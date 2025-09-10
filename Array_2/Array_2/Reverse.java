package Array.Array_Level2;
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int number = input.nextInt();
        int temp = number;
        int count = 0;
        if (temp == 0)
        {
            count = 1;
        }
        else
        {
            while (temp != 0)
            {
                temp /= 10;
                count++;
            }
        }
        int[] digits = new int[count];
        temp = number;
        for (int i = 0; i < count; i++)
        {
            digits[i] = temp % 10;
            temp /= 10;
        }
        System.out.print("Reversed number: ");
        for (int digit : digits)
        {
            System.out.print(digit);
        }
        System.out.println();
        input.close();
    }
}
