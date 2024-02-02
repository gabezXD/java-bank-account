package entities;

public class Account {
    
    private int accountNumber;
    private String accountName;
    private double balance = 0.00;

    public Account(String accountName, int accountNumber) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
    }

    public Account(String accountName, int accountNumber, double initialDeposit) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        deposit(initialDeposit);
    }

    public Account() {
    }

    public String getAccountName() {
        return accountName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }


    public double getBalance() {
        return balance;
    }


    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount + 5.00;
    }

    public String toString() {
        return "Account "
               + accountNumber
               +", Holder: "
               + accountName
               +", Balance: $"
               +String.format("%.2f", balance);
    }

}
