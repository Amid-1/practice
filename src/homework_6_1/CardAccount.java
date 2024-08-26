public class CardAccount extends BankAccount {
    private static final double COMMISSION_RATE = 0.01;
    public CardAccount(double inicialBalance) {
        super(inicialBalance);
    }

    @Override
    public boolean withdraw(double amount) {
        double totalAmount = amount + amount * COMMISSION_RATE;
        return super.withdraw(amount);
    }
}
