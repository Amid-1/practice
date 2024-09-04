package homework_6_3;

public abstract class Client {

    protected double balance;

    public Client(double balance) {
        this.balance = balance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    public double getBalance() {
        return balance;
    }

    public abstract void printAccountInfo();
}
