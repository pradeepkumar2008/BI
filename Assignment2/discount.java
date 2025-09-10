import java.util.Scanner;
public class discount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter fee: ");
        double feeInput = input.nextDouble();
        System.out.print("Enter discount percent: ");
        double discPercent = input.nextDouble();
        double discAmount = feeInput * discPercent / 100.0;
        double finalDiscFee = feeInput - discAmount;
        System.out.println("The discount amount is INR " + discAmount + " and final discounted fee is INR " + finalDiscFee);
        input.close();
    }
}
