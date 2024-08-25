package homework_6_1;

public class BankAccount {
    protected double balance;

    public BankAccount(double inicialBalance) {
        this.balance = inicialBalance;
    }

    public void deposit (double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public boolean withdraw (double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }
}
