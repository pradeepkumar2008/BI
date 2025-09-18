package Encapsulation_Polymorphism;
import java.util.*;

interface Loanable{
    void applyForLoan(double amt);
    boolean calculateLoanEligibility();
}

abstract class BankAccount{
    private String accountNumber,holderName;
    private double balance;
    public BankAccount(String a,String h,double b){accountNumber=a;holderName=h;balance=b;}
    public String getAccountNumber(){return accountNumber;}
    public String getHolderName(){return holderName;}
    public double getBalance(){return balance;}
    public void deposit(double amt){balance+=amt;}
    public void withdraw(double amt){if(balance>=amt)balance-=amt;}
    public abstract double calculateInterest();
    public void printDetails(){System.out.println(holderName+" | AccNo:"+accountNumber+" | Balance:"+balance+" | Interest:"+calculateInterest());}
}

class SavingsAccount extends BankAccount implements Loanable{
    public SavingsAccount(String a,String h,double b){super(a,h,b);}
    public double calculateInterest(){return getBalance()*0.04;}
    public void applyForLoan(double amt){System.out.println("Savings loan applied: "+amt);}
    public boolean calculateLoanEligibility(){return getBalance()>=5000;}
}

class CurrentAccount extends BankAccount implements Loanable{
    public CurrentAccount(String a,String h,double b){super(a,h,b);}
    public double calculateInterest(){return getBalance()*0.02;}
    public void applyForLoan(double amt){System.out.println("Current loan applied: "+amt);}
    public boolean calculateLoanEligibility(){return getBalance()>=10000;}
}

public class BankingSystem{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        List<BankAccount> list=new ArrayList<>();
        System.out.print("Enter number of accounts: ");int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("Type (1-Savings,2-Current): ");int t=sc.nextInt();sc.nextLine();
            System.out.print("Account No: ");String acc=sc.nextLine();
            System.out.print("Holder Name: ");String name=sc.nextLine();
            System.out.print("Balance: ");double bal=sc.nextDouble();
            if(t==1)list.add(new SavingsAccount(acc,name,bal));
            else if(t==2)list.add(new CurrentAccount(acc,name,bal));
        }
        for(BankAccount b:list)b.printDetails();
    }
}

