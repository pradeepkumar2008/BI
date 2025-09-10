package Array.Array_Level2;
import java.util.Scanner;
public class Bonus_Employee {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] salaries = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonuses = new double[10];
        double[] newSalaries = new double[10];
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        for (int i = 0; i < 10; )
        {
            System.out.println("Enter details for employee " + (i + 1) + ":");
            System.out.print("Salary: ");
            double salary = input.nextDouble();
            System.out.print("Years of Service: ");
            double years = input.nextDouble();
            if (salary < 0 || years < 0)
            {
                System.out.println("Invalid input. Please enter positive values.");
                continue;
            }
            salaries[i] = salary;
            yearsOfService[i] = years;
            i++;
        }
        for (int i = 0; i < 10; i++)
        {
            if (yearsOfService[i] > 5)
            {
                bonuses[i] = salaries[i] * 0.05;
            }
            else
            {
                bonuses[i] = salaries[i] * 0.02;
            }
            newSalaries[i] = salaries[i] + bonuses[i];
            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }
        System.out.println("\n--- Company Payout Summary ---");
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);
        input.close();
    }
}
