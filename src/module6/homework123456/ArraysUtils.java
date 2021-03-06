package module6.homework123456;


import java.util.Arrays;

public final class ArraysUtils {

    public static final int secondLargest(int array[]) {
        int max = max(array);
        int result = array[0];

        // variant 1 of the secondLargest solution
        for (int anArray : array) {
            if (anArray > result && result < max) {
                result = anArray;
            }

            // variant 2 of the secondLargest solution
//
//            if (array[index] == max) {
//                continue;
//            }
//            if (array[index] > result) {
//                result = array[index];
//            }
        }
        return result;
    }

    public static final int modulus(int array[]) {
        return (array[0] % array[array.length - 1]);
    }

    public static final int multiplication(int array[]) {
        int multiplicateTotal = 1;

        for (int item : array) {
            multiplicateTotal *= item;
        }
        return multiplicateTotal;
    }

    public static final int maxPositive(int array[]) {
        int maxPositiveElement = 0;

        for (int item : array) {
            if (item > 0) {
                if (item > maxPositiveElement) {
                    maxPositiveElement = item;
                }
            }
        }
        return maxPositiveElement;
    }

    public static final int max(int array[]) {
        int maxElement = array[0];

        for (int item : array) {
            if (item > maxElement) {
                maxElement = item;
            }
        }
        return maxElement;
    }

    public static final int min(int array[]) {
        int minElement = array[0];

        for (int item : array) {
            if (item < minElement) {
                minElement = item;
            }
        }
        return minElement;
    }

    public static final int sum(int array[]) {
        int sumOfArray = 0;

        for (int item : array) {
            sumOfArray += item;
        }
        return sumOfArray;
    }

    public static final int[] reverse(int[] array) {
        // handling null, empty and one element array
        if (array == null || array.length <= 1) {
            return array;
        }

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i]; // swap numbers
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;

    }

    public static final int[] findEvenElements(int[] array) {
        int[] result = new int[0];

        // variant 1 of the findEventElements solution
        for (int value : array) {
            if (value % 2 == 0) {
                result = Arrays.copyOf(result, result.length + 1);
                result[result.length - 1] = value;
            }
        }

        // variant 2 of the findEventElements solution

//        int countEvens = 0;
//        for (int arr : array) {
//            if (arr % 2 == 0) {
//                countEvens++;
//            }
//        }
//        int[] evens = new int[countEvens];
//
//        int j = 0;
//        for (int arr : array) {
//            if (arr % 2 == 0) {
//                result[j] = arr;
//                j++;
//            }
//        }
        return result;
    }

}