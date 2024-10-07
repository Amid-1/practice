package homework_6_4;

import java.util.Random;

public class Manager implements Employee{
    private static final double FIXED_SALARY = 50000;
    private double bonus;

    public Manager() {
        Random rand = new Random();
        double earnedMoney = 115000 + rand.nextInt(25000);
        this.bonus = earnedMoney * 0.05;
    }

    @Override
    public double getMonthSalary() {
        return FIXED_SALARY + bonus;
    }
}
