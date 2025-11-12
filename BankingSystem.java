import java.util.*;

class Account {
    int accountId;
    String name;

    public Account(int accountId, String name) {
        this.accountId = accountId;
        this.name = name;
    }

    public String toString() {
        return "Account[ID=" + accountId + ", Name=" + name + "]";
    }
}

class Transaction {
    int id;
    int accountId;
    double amount;

    public Transaction(int id, int accountId, double amount) {
        this.id = id;
        this.accountId = accountId;
        this.amount = amount;
    }

    public String toString() {
        return "Transaction[ID=" + id + ", AccountID=" + accountId + ", Amount=" + amount + "]";
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        List<Transaction> transactionList = new ArrayList<>();
        Queue<Transaction> pendingTransactions = new LinkedList<>();
        Set<Integer> validAccounts = new HashSet<>(Arrays.asList(101, 102, 103));
        Stack<Transaction> transactionStack = new Stack<>();

        pendingTransactions.add(new Transaction(1, 101, 5000));
        pendingTransactions.add(new Transaction(2, 104, 2000)); 
        pendingTransactions.add(new Transaction(3, 102, 1500));

        System.out.println("Processing Transactions:");
        while (!pendingTransactions.isEmpty()) {
            Transaction t = pendingTransactions.poll();
            if (validAccounts.contains(t.accountId)) {
                transactionList.add(t);
                transactionStack.push(t);
                System.out.println("Transaction successful: " + t);
            } else {
                System.out.println("Invalid account: " + t);
            }
        }

        System.out.println("\nRolling Back Last Transaction...");
        if (!transactionStack.isEmpty()) {
            Transaction last = transactionStack.pop();
            transactionList.remove(last);
            System.out.println("Rolled back: " + last);
        }

        System.out.println("\nFinal Transactions:");
        transactionList.forEach(System.out::println);
    }
}
