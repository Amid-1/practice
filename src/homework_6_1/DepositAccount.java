import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DepositAccount extends BankAccount {
    private LocalDate lastDepositDate;
    public DepositAccount(double inicialBalance) {
        super(inicialBalance);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
        lastDepositDate = LocalDate.now();
    }

    @Override
    public boolean withdraw(double amount) {
        if (ChronoUnit.DAYS.between(lastDepositDate, LocalDate.now()) >= 30) {
            return super.withdraw(amount);
        }
        System.out.println("Снятие невозможно: прошло менее месяца с последнего внесения.");
        return false;
    }
}
