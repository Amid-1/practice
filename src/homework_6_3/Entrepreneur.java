package homework_6_3;

public class Entrepreneur extends Client {

    public Entrepreneur(double balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        if (amount < 1000) {
            balance += amount * 0.99; // 1% комиссия
        } else {
            balance += amount * 0.995; // 0.5% комиссия
        }
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }

    @Override
    public void printAccountInfo() {
        System.out.println("Индивидуальный предприниматель:");
        System.out.println("Условие пополнения: комиссия 1% если сумма меньше 1000 рублей, комиссия 0.5% если сумма больше либо равна 1000 рублей");
        System.out.println("Условие снятия: без комиссии");
        System.out.println("Баланс: " + balance);
    }
}

