package udemy;

import java.util.Arrays;

public class Problem {
    public static void main(String[] args) {
        int[] array = {-3, -2, 1, 4, -9};
        int[] result = getPositiveNumbers(array);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }

    private static int[] getPositiveNumbers(int[] array) {
        int[] result = new int[array.length];
        int count = 0;
        for (int value : array) {
            if (value > 0) {
                result[count++] = value;
            }
        }
        return Arrays.copyOf(result, count);
    }

}


