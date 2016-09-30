package module6.Tests;


public class TestUniqueArray {

    /**
     * Return true if number num is appeared only once in the
     * array â€“ num is unique.
     */
    public static boolean isUnique(int[] array, int num) {
        for (int arr : array) {
            if (arr == num) {
                return false;
            }
        }
        return true;
    }

    /**
     * Convert the given array to an array with unique values â€“
     * without duplicates and Return it
     */
    public static int[] toUniqueArray(int[] array) {
        int[] temp = new int[array.length];

        // TO DO
        // if array has 0?

        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            if (isUnique(temp, array[i]))
                temp[counter++] = array[i];
        }

        int[] uniqueArray = new int[counter];
        System.arraycopy(temp, 0, uniqueArray, 0, uniqueArray.length);

        return uniqueArray;
    }

}
