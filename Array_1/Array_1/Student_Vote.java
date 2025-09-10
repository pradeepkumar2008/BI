package Array.Array_Level1;
import java.util.Scanner;
public class Student_Vote {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 10;
        int[] age = new int[size];
        System.out.println("Enter age:");
        for (int i = 0; i < size; i++) {
            age[i] = scanner.nextInt();
        }
        for (int x : age) {
            if (x >= 18) {
                System.out.println("The student with the age " + x + " can vote");
            } else {
                System.out.println("The student with the age " + x + " cannot vote");
            }
        }
    }
}
