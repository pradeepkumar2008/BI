class AccountNotFoundException extends Exception {  }
class InsufficientFundsException_C extends Exception {  }

public class TransactionManager {

    public void verifyAccount(String id) throws AccountNotFoundException { 
        if (id.equals("123")) {
             throw new AccountNotFoundException();
        }
    }
    
    public void processTransaction(double amount) throws InsufficientFundsException_C { 
        if (amount > 1000) {
            throw new InsufficientFundsException_C();
        }
    }
    
    public void executeTransaction(String id, double amount) throws Exception { 
        verifyAccount(id);
        processTransaction(amount);
        System.out.println("Transaction successful.");
    }
    
    public static void main(String[] args) {
        TransactionManager tm = new TransactionManager();
        try {
            tm.executeTransaction("123", 500);
        } catch (AccountNotFoundException e) {
            System.out.println("Error: Account not found."); 
        } catch (InsufficientFundsException_C e) {
            System.out.println("Error: Insufficient funds.");
        } catch (Exception e) {
            System.out.println("General error.");
        } finally {
            System.out.println("Transaction complete."); 
        }
    }
}