class InsufficientFundsException extends Exception { 
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class ATM { 
    private double balance = 10000;

    public void withdraw(double amount) throws InsufficientFundsException { 
        if (amount > balance) {
            throw new InsufficientFundsException("Withdrawal amount " + amount + " exceeds balance " + balance);
        }
        balance -= amount;
        System.out.println("Withdrawal successful. New balance: " + balance);
    }
}

public class ATMDemo {
    public static void main(String[] args) {
        ATM atm = new ATM();
        try {
            atm.withdraw(5000);
            atm.withdraw(6000); 
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}