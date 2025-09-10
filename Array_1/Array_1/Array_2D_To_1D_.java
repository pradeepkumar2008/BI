package Array.Array_Level1;
import java.util.Scanner;
public class Array_2D_To_1D_ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Rows: ");
        int rows = input.nextInt();
        System.out.print("Enter Columns: ");
        int cols = input.nextInt();
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter Numbers:");
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                matrix[i][j] = input.nextInt();
            }
        }
        int[] sArray = new int[rows * cols];
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sArray[index] = matrix[i][j];
                index++;
            }
        }
        System.out.print("1D array: ");
        for (int element : sArray)
        {
            System.out.print(element + " ");
        }
        System.out.println();

    }
}
