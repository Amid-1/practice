package homework_6_4;

public class TopManager implements Employee{
    private static final double FIXED_SALARY = 100000;
    private Company company;

    public TopManager (Company company) {
        this.company = company;
    }
    @Override
    public double getMonthSalary() {
        return 0;
    }
}
