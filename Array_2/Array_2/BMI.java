package Array.Array_Level2;
import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int numPersons = input.nextInt();
        double[] weights = new double[numPersons];
        double[] heights = new double[numPersons];
        double[] bmis = new double[numPersons];
        String[] statuses = new String[numPersons];
        for (int i = 0; i < numPersons; i++)
        {
            System.out.println("\nEnter details for person " + (i + 1) + ":");
            System.out.print("Weight in kg: ");
            weights[i] = input.nextDouble();
            System.out.print("Height in meters: ");
            heights[i] = input.nextDouble();
            bmis[i] = weights[i] / (heights[i] * heights[i]);
            if (bmis[i] <= 18.4)
            {
                statuses[i] = "Underweight";
            }
            else if (bmis[i] >= 18.5 && bmis[i] <= 24.9)
            {
                statuses[i] = "Normal";
            }
            else if (bmis[i] >= 25.0 && bmis[i] <= 39.9)
            {
                statuses[i] = "Overweight";
            }
            else
            {
                statuses[i] = "Obese";
            }
        }
        System.out.println("\n--- BMI Results ---");
        System.out.printf("%-10s %-10s %-10s %-10s %-15s\n", "Person", "Height(m)", "Weight(kg)", "BMI", "Status");
        for (int i = 0; i < numPersons; i++)
        {
            System.out.printf("%-10d %-10.2f %-10.2f %-10.2f %-15s\n", (i+1), heights[i], weights[i], bmis[i], statuses[i]);
        }
        input.close();
    }
}
