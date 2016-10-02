package module2.homework.task1;

import java.util.Random;


public class Task1Main {

    // Generating data
    static void arrayGenerate(int[] arrayName) {

        Random numberGenerator = new Random();

        for (int i = 0; i < arrayName.length; i++) {
            arrayName[i] = numberGenerator.nextInt(15) - 7; // To generate both positive and negative numbers
        }
    }

    static void arrayGenerate(double[] arrayName) {

        Random numberGenerator = new Random();

        for (int i = 0; i < arrayName.length; i++) {
            arrayName[i] = numberGenerator.nextDouble() * 15 - 7; // To generate both positive and negative numbers
        }
    }

    // Separator on print
    static void separatorOnPrint(char delimiterSymbol, int numberOfDelimiterSymbol) {
        for (int i = 0; i <= numberOfDelimiterSymbol; i++) {
            System.out.print(delimiterSymbol);
        }
        System.out.println();
    }

    // Printing generated data
    static void arrayPrint(int[] arrayName) {
        for (int i = 0; i < arrayName.length; i++) {
            System.out.println("arrayInt[" + i + "] = " + arrayName[i]);
        }
    }


    static void arrayPrint(double[] arrayName) {
        for (int i = 0; i < arrayName.length; i++) {
            System.out.println("arrayDouble[" + i + "] = " + arrayName[i]);
        }
    }

    // Sum
    static int sum(int arrayName[]) {
        int sumOfArray = 0;

        for (int item : arrayName) {
            sumOfArray += item;
        }
        return sumOfArray;
    }

    static double sum(double[] arrayName) {
        double sumOfArray = 0.0;

        for (double item : arrayName) {
            sumOfArray += item;
        }
        return sumOfArray;
    }

    // Min
    static int min(int arrayName[]) {
        int minElement = arrayName[0];

        for (int item : arrayName) {
            if (item < minElement) {
                minElement = item;
            }
        }
        return minElement;
    }

    static double min(double[] arrayName) {
        double minElement = arrayName[0];

        for (double item : arrayName) {
            if (item < minElement) {
                minElement = item;
            }
        }
        return minElement;
    }

    // Max
    static int max(int arrayName[]) {
        int maxElement = arrayName[0];

        for (int item : arrayName) {
            if (item > maxElement) {
                maxElement = item;
            }
        }
        return maxElement;
    }

    static double max(double[] arrayName) {
        double maxElement = arrayName[0];

        for (double item : arrayName) {
            if (item > maxElement) {
                maxElement = item;
            }
        }
        return maxElement;
    }

    // Max positive
    static int maxPositive(int arrayName[]) {
        int maxPositiveElement = 0;

        for (int item : arrayName) {
            if (item > 0) {
                if (item > maxPositiveElement) {
                    maxPositiveElement = item;
                }
            }
        }
        return maxPositiveElement;
    }

    static double maxPositive(double[] arrayName) {
        double maxPositiveElement = 0;

        for (double item : arrayName) {
            if (item > 0) {
                if (item > maxPositiveElement) {
                    maxPositiveElement = item;
                }
            }
        }
        return maxPositiveElement;
    }

    // Multiplication of all array elements
    static int multiplication(int arrayName[]) {
        int multiplicateTotal = 1;

        for (int item : arrayName) {
            multiplicateTotal *= item;
        }
        return multiplicateTotal;
    }

    static double multiplication(double[] arrayName) {
        double multiplicateTotal = 1.0;

        for (double item : arrayName) {
            multiplicateTotal *= item;
        }
        return multiplicateTotal;

    }

    // Modulus of first and last element
    static int modulus(int arrayName[]) {
        return (arrayName[0] % arrayName[arrayName.length - 1]);
    }

    static double modulus(double[] arrayName) {
        return (arrayName[0] % arrayName[arrayName.length - 1]);
    }

    // Second largest number of array
    static int secondLargest(int arrayName[]) {
        int maxFirstElement = max(arrayName);
        int maxSecondElement = arrayName[0];

        for (int i = 0; i < arrayName.length; i++) {
            if (arrayName[i] == maxFirstElement) {
                continue;
            }
            if (arrayName[i] > maxSecondElement) {
                maxSecondElement = arrayName[i];
            }
        }
        return maxSecondElement;
    }

    static double secondLargest(double[] arrayName) {
        double maxFirstElement = max(arrayName);
        double maxSecondElement = arrayName[0];

        for (int i = 0; i < arrayName.length; i++) {
            if (arrayName[i] == maxFirstElement) {
                continue;
            }
            if (arrayName[i] > maxSecondElement) {
                maxSecondElement = arrayName[i];
            }
        }
        return maxSecondElement;
    }


    public static void main(String[] args) {

        final int ARRAY_CAPACITY = 10;
        final int NUMBER_OF_DELIMETER = 32;
        final char DELIMITER_SYMBOL_1 = '-';
        final char DELIMITER_SYMBOL_2 = '=';

        int[] myArrayInt = new int[ARRAY_CAPACITY];
        double[] myArrayDouble = new double[ARRAY_CAPACITY];

        // Preparing of data
        arrayGenerate(myArrayInt);
        arrayGenerate(myArrayDouble);

        // Print and calculate integer data
        separatorOnPrint(DELIMITER_SYMBOL_2, NUMBER_OF_DELIMETER);
        arrayPrint(myArrayInt);
        separatorOnPrint(DELIMITER_SYMBOL_1, NUMBER_OF_DELIMETER);
        System.out.println("Sum of arrayInt is: " + sum(myArrayInt));
        System.out.println("Min of arrayInt is: " + min(myArrayInt));
        System.out.println("Max of arrayInt is: " + max(myArrayInt));
        System.out.println("Max positive of arrayInt is: " + maxPositive(myArrayInt));
        System.out.println("Multiplication of arrayInt is: " + multiplication(myArrayInt));
        System.out.println("Modulus of first and last element of arrayInt is: " + myArrayInt[0]
                + " % " + myArrayInt[myArrayInt.length - 1] + " = " + modulus(myArrayInt));
        System.out.println("Second largest of arrayInt is: " + secondLargest(myArrayInt));
        separatorOnPrint(DELIMITER_SYMBOL_2, NUMBER_OF_DELIMETER);

        // Print and calculate double data
        arrayPrint(myArrayDouble);
        separatorOnPrint(DELIMITER_SYMBOL_1, NUMBER_OF_DELIMETER);
        System.out.println("Sum of arrayDouble is: " + sum(myArrayDouble));
        System.out.println("Min of arrayDouble is: " + min(myArrayDouble));
        System.out.println("Max of arrayDouble is: " + max(myArrayDouble));
        System.out.println("Max positive of arrayDouble is: " + maxPositive(myArrayDouble));
        System.out.println("Multiplication of arrayDouble is: " + multiplication(myArrayDouble));
        System.out.println("Modulus of first and last element of arrayDouble is: " + myArrayDouble[0]
                + " % " + myArrayDouble[myArrayDouble.length - 1] + " = " + modulus(myArrayDouble));
        System.out.println("Second largest of arrayDouble is: " + secondLargest(myArrayDouble));
        separatorOnPrint(DELIMITER_SYMBOL_2, NUMBER_OF_DELIMETER);

    }
}
