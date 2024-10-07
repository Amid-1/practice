package homework_6_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Company {
    private List<Employee> employees = new ArrayList<>();
    private double income;

    public void hire(Employee employee) {
        employees.add(employee);
    }

    public void hireAll (List<Employee> employees) {
        this.employees.addAll(employees);
    }

    public void fire(Employee employee) {
        employees.remove(employee);
    }

    public double getIncome () {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public List<Employee> getTopSalaryStaff(int count) {
        if (count < 0 || count > employees.size()) {
            return Collections.emptyList();
        }
        employees.sort(Comparator.comparingDouble(Employee::getMonthSalary).reversed());
        return employees.subList(0, count);
    }

    public List<Employee> getLowestSalaryStaff(int count) {
        if (count < 0 || count > employees.size()) {
            return Collections.emptyList();
        }
        employees.sort(Comparator.comparingDouble(Employee::getMonthSalary));
        return employees.subList(0, count);
    }
}
