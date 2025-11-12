public class BankTransactions {

    public static double getRemainingLimit(Double dailyLimit, double withdrawalAmount) {
        double limit = (dailyLimit == null) ? 0.0 : dailyLimit;
        
        if (limit == 0.0) {
            System.out.println("No limit set. Transaction denied.");
            return 0.0;
        }
        return limit - withdrawalAmount;
    }

    public static void main(String[] args) {
        Double activeLimit = 1000.0;
        Double nullLimit = null;
        
        System.out.println("Remaining limit (Active): " + getRemainingLimit(activeLimit, 200.0));
        System.out.println("Remaining limit (Null): " + getRemainingLimit(nullLimit, 100.0));
    }
}