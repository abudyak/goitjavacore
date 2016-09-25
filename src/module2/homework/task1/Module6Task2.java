package module2.homework.task1;


import java.util.Random;

public class Module6Task2 {

    // Generating data
    static void arrayGenerate(int[] arrayName) {

        Random numberGenerator = new Random();

        for (int index = 0; index < arrayName.length; index++) {
            arrayName[index] = numberGenerator.nextInt(15) - 7; // To generate both positive and negative numbers
        }
    }

    public static void main(String[] args) {

        int[] myArrayInt = new int[10];

        // Preparing of data
        arrayGenerate(myArrayInt);

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
