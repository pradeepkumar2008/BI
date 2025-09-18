class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accNum, double bal, double rate) {
        super(accNum, bal);
        this.interestRate = rate;
    }

    void displayAccountType() {
        System.out.println("This is a Savings Account.");
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(String accNum, double bal, double limit) {
        super(accNum, bal);
        this.withdrawalLimit = limit;
    }

    void displayAccountType() {
        System.out.println("This is a Checking Account.");
    }
}

class FixedDepositAccount extends BankAccount {
    int termInYears;

    FixedDepositAccount(String accNum, double bal, int term) {
        super(accNum, bal);
        this.termInYears = term;
    }

    void displayAccountType() {
        System.out.println("This is a Fixed Deposit Account.");
    }

    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SA123", 5000, 3.5);
        CheckingAccount ca = new CheckingAccount("CA456", 3000, 1000);
        FixedDepositAccount fda = new FixedDepositAccount("FD789", 10000, 5);

        sa.displayAccountType();
        ca.displayAccountType();
        fda.displayAccountType();
    }
}
