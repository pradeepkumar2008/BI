import com.bank.util.InterestCalculator;
public class MainBank {
    public static void main(String[] args) {
        InterestCalculator ic = new InterestCalculator();
        System.out.println("Simple Interest: " + ic.calculateSimpleInterest(10000,5,2));
        System.out.println("Compound Interest: " + ic.calculateCompoundInterest(10000,5,2));
    }
}