package homework_6_3;

public class Individual extends Client {

    public Individual(double balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }

    @Override
    public void printAccountInfo() {
        System.out.println("Физическое лицо:");
        System.out.println("Условие пополнения: без комиссии");
        System.out.println("Условие снятия: без комиссии");
        System.out.println("Баланс: " + balance);///
    }
}
