package udemy;

import java.util.Arrays;

public class ProblemNew {


    public static void main(String[] args) {
        int[] array = {-3, -2, 1, 4, -9};
        DynaArray result = getPositiveNumbers(array);

        for (int i = 0; i < result.count; i++) {
            System.out.print(result.result[i] + " ");
        }
        System.out.println();
    }

    private static DynaArray getPositiveNumbers(int[] array) {
        int[] result = new int[array.length];
        int count = 0;
        for (int value : array) {
            if (value > 0) {
                result[count++] = value;
            }
        }
        DynaArray dynaArray = new DynaArray();
        dynaArray.result = result;
        dynaArray.count = count;
        return dynaArray;
        //return Arrays.copyOf(result, count);
    }

}

