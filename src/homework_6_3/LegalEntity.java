package homework_6_3;

// Юридические лица
public class LegalEntity extends Client{

    public LegalEntity(double balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount * 1.01; // 1% комиссия
    }

    @Override
    public void printAccountInfo() {
        System.out.println("Юридическое лицо: ");
        System.out.println("Условие пополнения: без комиссии");
        System.out.println("Условие снятия: комиссия 1%");
        System.out.println("Баланс: " + balance);
    }
}
