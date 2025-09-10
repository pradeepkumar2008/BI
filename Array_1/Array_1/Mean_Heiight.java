package Array.Array_Level1;
import java.util.Scanner;
public class Mean_Heiight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] heights = new double[11];
        double sum = 0.0;
        System.out.println("Enter the heights of the 11 players:");
        for (int i = 0; i < heights.length; i++)
        {
            System.out.print("Player " + (i + 1) + " height: ");
            heights[i] = input.nextDouble();
            sum += heights[i];
        }
        double mean = sum / heights.length;
        System.out.println("\nThe mean height of the team is: " + mean);
        input.close();
    }
}
