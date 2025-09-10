package Array.Array_Level2;
import java.util.Scanner;
public class BMI_2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int numPersons = input.nextInt();
        double[][] personData = new double[numPersons][3];
        String[] weightStatus = new String[numPersons];
        for (int i = 0; i < numPersons; )
        {
            System.out.println("\nEnter details for person " + (i + 1) + ":");
            System.out.print("Weight in kg: ");
            double weight = input.nextDouble();
            System.out.print("Height in meters: ");
            double height = input.nextDouble();
            if (weight <= 0 || height <= 0)
            {
                System.out.println("Please enter positive values for weight and height.");
                continue;
            }
            personData[i][0] = weight;
            personData[i][1] = height;
            i++;
        }
        for (int i = 0; i < numPersons; i++)
        {
            double weight = personData[i][0];
            double height = personData[i][1];
            double bmi = weight / (height * height);
            personData[i][2] = bmi;
            if (bmi <= 18.4)
            {
                weightStatus[i] = "Underweight";
            }
            else if (bmi <= 24.9)
            {
                weightStatus[i] = "Normal";
            }
            else if (bmi <= 39.9)
            {
                weightStatus[i] = "Overweight";
            }
            else
            {
                weightStatus[i] = "Obese";
            }
        }
        System.out.println("\n--- BMI Results ---");
        System.out.printf("%-10s %-10s %-10s %-10s %-15s\n", "Person", "Height(m)", "Weight(kg)", "BMI", "Status");
        for (int i = 0; i < numPersons; i++)
        {
            System.out.printf("%-10d %-10.2f %-10.2f %-10.2f %-15s\n", (i+1), personData[i][1], personData[i][0], personData[i][2], weightStatus[i]);
        }
        input.close();
    }
}
