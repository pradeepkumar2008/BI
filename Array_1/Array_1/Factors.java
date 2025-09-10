package Array.Array_Level1;
import java.util.Scanner;
public class Factors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to find its factors: ");
        int number = input.nextInt();
        int maxFactors = 10;
        int[] factors = new int[maxFactors];
        int index = 0;
        for (int i = 1; i <= number; i++)
        {
            if (number % i == 0)
            {
                if (index == maxFactors)
                {
                    maxFactors *= 2;
                    int[] temp = new int[maxFactors];
                    for(int j = 0; j < factors.length; j++)
                    {
                        temp[j] = factors[j];
                    }
                    factors = temp;
                }
                factors[index] = i;
                index++;
            }
        }
        System.out.print("The factors of " + number + " are: ");
        for (int i = 0; i < index; i++)
        {
            System.out.print(factors[i] + " ");
        }
        System.out.println();
        input.close();
    }
}
