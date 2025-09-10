package Array.Array_Level1;
import java.util.Scanner;
public class Multiple_Table {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int[] table = new int[10];
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }
        System.out.println("Multiplication Table" + number);
        for (int i = 0; i < table.length; i++)
        {
            System.out.println(" " + table[i]);
        }
        input.close();
    }
}
