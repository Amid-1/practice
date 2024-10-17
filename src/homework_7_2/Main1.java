package homework_7_2;

import homework_7_1.Employee;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main1 {
    private static String staffFile = "data/staff.txt";
    private static String dateFormat = "dd.MM.yyyy";

    public static void main(String[] args) {
        ArrayList<Employee> staff = loadStaffFromFile();

        // Получаем сотрудника с максимальной зарплатой среди тех, кто пришёл в 2017 году
        Optional<Employee> highestPaid2017Employee = staff.stream()
                .filter(e -> {
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(e.getWorkStart());
                    return calendar.get(Calendar.YEAR) == 2017;
                })
                .max(Comparator.comparing(Employee::getSalary));

        highestPaid2017Employee.ifPresent(System.out::println);
    }

    private static ArrayList<Employee> loadStaffFromFile() {
        ArrayList<Employee> staff = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(Paths.get(staffFile));
            for (String line : lines) {
                String[] fragments = line.split("\t");
                if (fragments.length != 3) {
                    System.out.println("Wrong line: " + line);
                    continue;
                }
                staff.add(new Employee(
                        fragments[0],
                        Integer.parseInt(fragments[1]),
                        (new SimpleDateFormat(dateFormat)).parse(fragments[2])
                ));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return staff;
    }
}