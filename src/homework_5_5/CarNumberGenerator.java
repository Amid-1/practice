package homework_5_5;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class CarNumberGenerator {
    private static final String LETTERS = "ABEKMHOPCTYX";
    private static final int REGION_MIN = 1;
    private static final int REGION_MAX = 199;
    
    public static void main(String[] args) {
        //A111AA197
        //ABEKMHOPCTYX

        ArrayList<String> list = new ArrayList<>();
        Set<String> treeSet = new TreeSet<>();
        Set<String> hashSet = new HashSet<>();



        for (int i = 0; i < 2000000; i++){
            String number = generateCarNumber();
            list.add(number);
            hashSet.add(number);
            treeSet.add(number);
        }

        Scanner scanner = new Scanner(System.in);
        for (; ; ) {
            // прямой перебор list.contains
            // Бинарный поиск Collections.binarySearch()
            // TreeSet
            // HashSet
            System.out.println("Введите номер для поиска или 'exit' для выхода: ");
            String searchNumber = scanner.nextLine();
            if (searchNumber.equalsIgnoreCase("exit")) {
                break;
            }

            // прямой перебор
            long startTime = System.nanoTime();
            boolean found = list.contains(searchNumber);
            long duration = System.nanoTime() - startTime;
            System.out.println("поиск перебором: номер " + (found ? "найден" : "не найден") + ", время поиска: " + duration + "нс");

            // бинарный поиск
            startTime = System.nanoTime();
            int index = Collections.binarySearch(list, searchNumber);
            duration = System.nanoTime() - startTime;
            System.out.println("Бинарный поиск: номер " + (index >= 0 ? "найден" : "не найден") + ", поиск занял " + duration + "нс");

            // Поиск в HashSet
            startTime = System.nanoTime();
            found = hashSet.contains(searchNumber);
            duration = System.nanoTime() - startTime;
            System.out.println("Поиск в HashSet: номер " + (found ? "найден" : "не найден") + ", поиск занял " + duration + "нс");

            // Поиск в TreeSet
            startTime = System.nanoTime();
            found = treeSet.contains(searchNumber);
            duration = System.nanoTime() - startTime;
            System.out.println("Поиск в TreeSet: номер " + (found ? "найден" : "не найден") + ", поиск занял " + duration + "нс");
        }

    }

    private static String generateCarNumber() {
        char letter1 = LETTERS.charAt(ThreadLocalRandom.current().nextInt(LETTERS.length()));
        char letter2 = LETTERS.charAt(ThreadLocalRandom.current().nextInt(LETTERS.length()));
        char letter3 = LETTERS.charAt(ThreadLocalRandom.current().nextInt(LETTERS.length()));
        int digits = ThreadLocalRandom.current().nextInt(1000);
        int region = ThreadLocalRandom.current().nextInt(REGION_MIN, REGION_MAX + 1);
        return String.format("%c%03d%c%c%d", letter1, digits, letter2, letter3, region);
    }
}
