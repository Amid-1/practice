package homework_6_4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        company.setIncome(12000000); // Установим доход компании

        // Найм сотрудников
        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < 180; i++) {
            employees.add(new Operator());
        }
        for (int i = 0; i < 80; i++) {
            employees.add(new Manager());
        }
        for (int i = 0; i < 10; i++) {
            employees.add(new TopManager(company));
        }
        company.hireAll(employees);

        // Печать самых высоких зарплат
        System.out.println("Самые высокие зарплаты:");
        for (Employee e : company.getTopSalaryStaff(15)) {
            System.out.println(e.getMonthSalary() + " руб.");
        }

        // Печать самых низких зарплат
        System.out.println("Самые низкие зарплаты:");
        for (Employee e : company.getLowestSalaryStaff(30)) {
            System.out.println(e.getMonthSalary() + " руб.");
        }

        // Увольнение 50% сотрудников
        int halfSize = employees.size() / 2;
        for (int i = 0; i < halfSize; i++) {
            company.fire(employees.get(i));
        }

        // Печать самых высоких зарплат после увольнения
        System.out.println("Самые высокие зарплаты после увольнения:");
        for (Employee e : company.getTopSalaryStaff(15)) {
            System.out.println(e.getMonthSalary() + " руб.");
        }

        // Печать самых низких зарплат после увольнения
        System.out.println("Самые низкие зарплаты после увольнения:");
        for (Employee e : company.getLowestSalaryStaff(30)) {
            System.out.println(e.getMonthSalary() + " руб.");
        }
    }
}
