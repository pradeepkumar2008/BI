import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number1: ");
        double number1 = input.nextDouble();
        System.out.print("Enter number2: ");
        double number2 = input.nextDouble();
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " +
                number1 + " and " + number2 + " is " + (number1 + number2) + ", " + (number1 - number2) + ", " +
                (number1 * number2) + ", " + (number1 / number2));
        input.close();
    }
}
