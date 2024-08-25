package homework_5_4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class PhoneBook {
    public static void main(String[] args) {
        HashMap<String, String> phoneBook = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите комманду (add, find, list, exit): ");
            String command = scanner.nextLine();
            if (command.equalsIgnoreCase("add")) {
                System.out.println("Введите имя: ");
                String name = scanner.nextLine();
                System.out.println("Введите номер телефона: ");
                String phoneNumber = scanner.nextLine();
                phoneBook.put(name, phoneNumber);
                System.out.println("Контакт добавлен.");
            } else if (command.equalsIgnoreCase("find")) {
                System.out.println("Введите имя или номер телефона: ");
                String input = scanner.nextLine();
                boolean found = false;
                for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
                    if (entry.getKey().equalsIgnoreCase(input) || entry.getValue().equals(input)) {
                        System.out.println("Имя: " + entry.getKey() + "Номер телефона: " + entry.getValue());
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Контакт не найден");
                }
            } else if (command.equalsIgnoreCase("list")) {
                TreeMap<String, String> sortedPhoneBook = new TreeMap<>(phoneBook);
                for (Map.Entry<String, String> entry : sortedPhoneBook.entrySet()) {
                    System.out.println("Имя: " + entry.getKey() + ", Номер телефона: " + entry.getValue());
                }
            } else if (command.equalsIgnoreCase("exit")) {
                System.out.println("Выход из программы.");
                break;
            } else {
                System.out.println("Неверная команда.");
            }
        }
        scanner.close();
    }
}

/*
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class PhoneBook {
    public static void main(String[] args) {
        HashMap<String, String> phoneBook = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        String command;

        while (true) {
            System.out.println("Введите команду (add, find, list, exit):");
            command = scanner.nextLine();

            if (command.equalsIgnoreCase("add")) {
                System.out.println("Введите имя:");
                String name = scanner.nextLine();
                System.out.println("Введите номер телефона:");
                String phoneNumber = scanner.nextLine();
                phoneBook.put(name, phoneNumber);
                System.out.println("Контакт добавлен.");
            } else if (command.equalsIgnoreCase("find")) {
                System.out.println("Введите имя или номер телефона:");
                String input = scanner.nextLine();
                boolean found = false;
                for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
                    if (entry.getKey().equalsIgnoreCase(input) || entry.getValue().equals(input)) {
                        System.out.println("Имя: " + entry.getKey() + ", Номер телефона: " + entry.getValue());
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Контакт не найден.");
                }
            } else if (command.equalsIgnoreCase("list")) {
                TreeMap<String, String> sortedPhoneBook = new TreeMap<>(phoneBook);
                for (Map.Entry<String, String> entry : sortedPhoneBook.entrySet()) {
                    System.out.println("Имя: " + entry.getKey() + ", Номер телефона: " + entry.getValue());
                }
            } else if (command.equalsIgnoreCase("exit")) {
                System.out.println("Выход из программы.");
                break;
            } else {
                System.out.println("Неверная команда.");
            }
        }
        scanner.close();
    }
}


с циклом for:

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class PhoneBook {
    public static void main(String[] args) {
        HashMap<String, String> phoneBook = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        String command;

        for (;;) { // Бесконечный цикл for
            System.out.println("Введите команду (add, find, list, exit):");
            command = scanner.nextLine();

            if (command.equalsIgnoreCase("add")) {
                System.out.println("Введите имя:");
                String name = scanner.nextLine();
                System.out.println("Введите номер телефона:");
                String phoneNumber = scanner.nextLine();
                phoneBook.put(name, phoneNumber);
                System.out.println("Контакт добавлен.");
            } else if (command.equalsIgnoreCase("find")) {
                System.out.println("Введите имя или номер телефона:");
                String input = scanner.nextLine();
                boolean found = false;
                for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
                    if (entry.getKey().equalsIgnoreCase(input) || entry.getValue().equals(input)) {
                        System.out.println("Имя: " + entry.getKey() + ", Номер телефона: " + entry.getValue());
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Контакт не найден.");
                }
            } else if (command.equalsIgnoreCase("list")) {
                TreeMap<String, String> sortedPhoneBook = new TreeMap<>(phoneBook);
                for (String name : sortedPhoneBook.keySet()) {
                    System.out.println("Имя: " + name + ", Номер телефона: " + sortedPhoneBook.get(name));
                }
            } else if (command.equalsIgnoreCase("exit")) {
                System.out.println("Выход из программы.");
                break;
            } else {
                System.out.println("Неверная команда.");
            }
        }
        scanner.close();
    }
}

 */