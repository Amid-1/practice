package homework_6_3;

public class Bank {
    public static void main(String[] args) {
        Client individual = new Individual(1000);
        Client legalEntity = new LegalEntity(1000);
        Client entrepreneur = new Entrepreneur(1000);

        individual.deposit(500);
        individual.withdraw(200);
        individual.printAccountInfo();

        legalEntity.deposit(500);
        legalEntity.withdraw(200);
        legalEntity.printAccountInfo();

        entrepreneur.deposit(500);
        entrepreneur.withdraw(200);
        entrepreneur.printAccountInfo();
    }
}
