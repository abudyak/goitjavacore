package module2.homework.task1;


import module6.homework123456.ArraysUtils;
import java.util.Arrays;
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
        System.out.println(Arrays.toString(myArrayInt));

        System.out.println("---------------------------------------");
        System.out.println("Sum of arrayInt is: " + ArraysUtils.sum(myArrayInt));
        System.out.println("Min of arrayInt is: " + ArraysUtils.min(myArrayInt));
        System.out.println("Max of arrayInt is: " + ArraysUtils.max(myArrayInt));
        System.out.println("Max positive of arrayInt is: " + ArraysUtils.maxPositive(myArrayInt));
        System.out.println("Multiplication of arrayInt is: " + ArraysUtils.multiplication(myArrayInt));
        System.out.println("Modulus of first and last element of arrayInt is: " + myArrayInt[0]
                + " % " + myArrayInt[myArrayInt.length - 1] + " = " + ArraysUtils.modulus(myArrayInt));
        System.out.println("Second largest of arrayInt is: " + ArraysUtils.secondLargest(myArrayInt));
        System.out.println("---------------------------------------");

        System.out.println("Reversed array is: ");
        ArraysUtils.reverse(myArrayInt);
        System.out.println(Arrays.toString(myArrayInt));
        System.out.println("---------------------------------------");

        System.out.println("Even elements are:");
        int[] evenElements = ArraysUtils.findEvenElements(myArrayInt);
        System.out.println(Arrays.toString(evenElements));
        System.out.println("---------------------------------------");

    }

}
