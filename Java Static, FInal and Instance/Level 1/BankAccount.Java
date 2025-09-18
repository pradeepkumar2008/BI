public class BankAccount {

    static String bankName = "Global Bank";
    static int totalAccounts = 0;

    String accountHolderName;
    final String accountNumber;

    BankAccount(String accountHolderName, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    void showDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
        }
    }

    public static void main(String[] args) {
        BankAccount a1 = new BankAccount("John", "1111");
        BankAccount a2 = new BankAccount("Jane", "2222");

        a1.showDetails();
        a2.showDetails();
        getTotalAccounts();
    }
}
