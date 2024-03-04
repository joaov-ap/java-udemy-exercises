package entities;

public class Bank {
    private final double TAX = 5.00;

    private int accountNumber;
    private String accountOwner;
    private double initialDeposit;
    private double balance;
    private double withdraw;

    public Bank(int accountNumber, String accountOwner, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.accountOwner = accountOwner;
        this.balance = initialDeposit;
    }

    public Bank(int accountNumber, String accountOwner) {
        this.accountNumber = accountNumber;
        this.accountOwner = accountOwner;
    }

    public Bank() {
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountOwner() {
        return accountOwner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance += balance;
    }

    public void setWithdraw(double withdraw) {
        this.balance -= withdraw + TAX;
    }

    public String toString() {
        return "Account " + getAccountNumber() + ", Holder: " + getAccountOwner() + ", Balance: $ " + String.format("%.2f", getBalance());
    }
}
