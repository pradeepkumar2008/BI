package Array.Array_Level1;
import java.util.Scanner;
public class Table_6To9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int[] multiply = new int[4];
        int arrI = 0;
        for (int i = 6; i <= 9; i++)
        {
            multiply[arrI] = num * i;
            arrI++;
        }
        System.out.println("Multiplication table "+num);
        arrI = 0;
        for (int i = 6; i <= 9; i++)
        {
            System.out.println(multiply[arrI]);
            arrI++;
        }
        input.close();
    }
}
