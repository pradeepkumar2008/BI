package Array.Array_Level2;
import java.util.Scanner;
public class Youngest_Friend {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];
        for (int i = 0; i < 3; i++)
        {
            System.out.println("Enter details for " + names[i] + ":");
            System.out.print("Age: ");
            ages[i] = input.nextInt();
            System.out.print("Height: ");
            heights[i] = input.nextDouble();
        }
        int youngestAge = ages[0];
        String youngestFriend = names[0];
        double tallestHeight = heights[0];
        String tallestFriend = names[0];
        for (int i = 1; i < 3; i++)
        {
            if (ages[i] < youngestAge)
            {
                youngestAge = ages[i];
                youngestFriend = names[i];
            }
            if (heights[i] > tallestHeight)
            {
                tallestHeight = heights[i];
                tallestFriend = names[i];
            }
        }
        System.out.println("\nThe youngest friend is " + youngestFriend + " with an age of " + youngestAge + ".");
        System.out.println("The tallest friend is " + tallestFriend + " with a height of " + tallestHeight + ".");
        input.close();
    }
}
