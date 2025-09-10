import java.util.Scanner;
public class kilometer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance in km: ");
        double kmInput = input.nextDouble();
        double milesConv = kmInput / 1.6;
        System.out.println("The total miles is " + milesConv + " mile for the given " + kmInput + " km");
        input.close();
    }
}
