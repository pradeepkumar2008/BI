class NegativeAmountException extends Exception {  }
class InsufficientFundsException_B extends Exception {  }
class NetworkFailureException extends Exception {  }

class Transaction { 
    public void processTransaction() throws NegativeAmountException, InsufficientFundsException_B, NetworkFailureException {
        double rand = Math.random();
        if (rand < 0.33) {
            throw new NegativeAmountException();
        } else if (rand < 0.66) {
            throw new InsufficientFundsException_B();
        } else {
            throw new NetworkFailureException();
        }
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Transaction tx = new Transaction();
        try {
            tx.processTransaction();
        } catch (NegativeAmountException e) {
            System.out.println("Transaction Error: Cannot process negative amounts."); 
        } catch (InsufficientFundsException_B e) {
            System.out.println("Transaction Error: Insufficient funds."); 
        } catch (NetworkFailureException e) {
            System.out.println("Transaction Error: Network failure. Try again later.");
        }
    }
}