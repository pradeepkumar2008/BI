import java.util.Scanner;
public class height {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter height in cm: ");
        double heightCm = input.nextDouble();
        double totalInches = heightCm / 2.54;
        int feetPart = (int)(totalInches / 12);
        double inchPart = totalInches % 12;
        System.out.println("Your Height in cm is " + heightCm + " while in feet is " + feetPart + " and inches is " + inchPart);
        input.close();
    }
}
