public class Main {
    public static void main(String[] args) {
        BankAccount regularAccount = new BankAccount(1000);
        DepositAccount depositAccount = new DepositAccount(1000);
        CardAccount cardAccount = new CardAccount(1000);

        // Обычный счёт
        regularAccount.deposit(500);
        regularAccount.withdraw(200);
        System.out.println("Остаток на обычном счёте: " + regularAccount.getBalance());

        // Депозитный счёт
        depositAccount.deposit(500);
        depositAccount.withdraw(200); // Попытка снять деньги до истечения месяца
        System.out.println("Остаток на депозитном счёте: " + depositAccount.getBalance());

        // Карточный счёт
        cardAccount.deposit(500);
        cardAccount.withdraw(200);
        System.out.println("Остаток на карточном счёте: " + cardAccount.getBalance());
    
    }
}
