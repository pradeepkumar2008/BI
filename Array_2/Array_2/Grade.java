package Array.Array_Level2;
import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();
        int[] physicsMarks = new int[numStudents];
        int[] chemistryMarks = new int[numStudents];
        int[] mathsMarks = new int[numStudents];
        double[] percentages = new double[numStudents];
        char[] grades = new char[numStudents];
        for (int i = 0; i < numStudents; )
        {
            System.out.println("\nEnter marks for student " + (i + 1) + " (out of 100):");
            System.out.print("Physics: ");
            int p = input.nextInt();
            System.out.print("Chemistry: ");
            int c = input.nextInt();
            System.out.print("Maths: ");
            int m = input.nextInt();
            if (p < 0 || c < 0 || m < 0 || p > 100 || c > 100 || m > 100)
            {
                System.out.println("Invalid marks. Please enter values between 0 and 100.");
                continue;
            }
            physicsMarks[i] = p;
            chemistryMarks[i] = c;
            mathsMarks[i] = m;
            percentages[i] = (p + c + m) / 3.0;
            if (percentages[i] >= 80) grades[i] = 'A';
            else if (percentages[i] >= 70) grades[i] = 'B';
            else if (percentages[i] >= 60) grades[i] = 'C';
            else if (percentages[i] >= 50) grades[i] = 'D';
            else if (percentages[i] >= 40) grades[i] = 'E';
            else grades[i] = 'R';
            i++;
        }
        System.out.println("Grade Report");
        System.out.printf("%-10s %-10s %-10s %-10s %-12s %-10s\n", "Student", "Physics", "Chemistry", "Maths", "Percentage", "Grade");
        for (int i = 0; i < numStudents; i++)
        {
            System.out.printf("%-10d %-10d %-10d %-10d %-12.2f %-10c\n", (i+1), physicsMarks[i], chemistryMarks[i], mathsMarks[i], percentages[i], grades[i]);
        }
        input.close();
    }
}
