package Array.Array_Level2;
import java.util.Scanner;
public class Grade_2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();
        int[][] marks = new int[numStudents][3];
        double[] percentages = new double[numStudents];
        char[] grades = new char[numStudents];
        for (int i = 0; i < numStudents; )
        {
            System.out.println("\nEnter marks for student " + (i + 1) + " (out of 100):");
            System.out.print("Physics, Chemistry, Maths: ");
            int p = input.nextInt();
            int c = input.nextInt();
            int m = input.nextInt();
            if (p < 0 || c < 0 || m < 0 || p > 100 || c > 100 || m > 100)
            {
                System.out.println("Invalid marks. Please enter values between 0 and 100.");
                continue;
            }
            marks[i][0] = p;
            marks[i][1] = c;
            marks[i][2] = m;
            i++;
        }
        for (int i = 0; i < numStudents; i++)
        {
            int totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = totalMarks / 3.0;
            if (percentages[i] >= 80) grades[i] = 'A';
            else if (percentages[i] >= 70) grades[i] = 'B';
            else if (percentages[i] >= 60) grades[i] = 'C';
            else if (percentages[i] >= 50) grades[i] = 'D';
            else if (percentages[i] >= 40) grades[i] = 'E';
            else grades[i] = 'R';
        }
        System.out.println("Student Grade Report");
        System.out.printf("%-10s %-10s %-10s %-10s %-12s %-10s\n", "Student", "Physics", "Chemistry", "Maths", "Percentage", "Grade");
        for (int i = 0; i < numStudents; i++)
        {
            System.out.printf("%-10d %-10d %-10d %-10d %-12.2f %-10c\n", (i+1), marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }
        input.close();
    }
}
