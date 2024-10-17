package homework_7_2;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Employee {
    private static String staffFile = "data/staff.txt";
    private static String dateFormat = "dd.MM.yyyy";

    public static void main(String[] args) {
        ArrayList<homework_7_1.Employee> staff = loadStaffFromFile();

        // Сортировка по заработной плате и имени
        staff.sort(Comparator.comparing(homework_7_1.Employee::getSalary)
                .thenComparing(homework_7_1.Employee::getName));

        for (homework_7_1.Employee employee : staff) {
            System.out.println(employee);
        }
    }

    private static ArrayList<homework_7_1.Employee> loadStaffFromFile() {
        ArrayList<homework_7_1.Employee> staff = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(Paths.get(staffFile));
            for (String line : lines) {
                String[] fragments = line.split("\t");
                if (fragments.length != 3) {
                    System.out.println("Wrong line: " + line);
                    continue;
                }
                staff.add(new homework_7_1.Employee(
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
