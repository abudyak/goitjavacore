package module7.homework.task12345.task5;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MeasureTimeOfExecution {

    /**
     * Generate Integer and String ArrayList and LinkedList with 1000 and 10000 elements.
     * Measure time of execution of the following methods and print it to console:
     * - add
     * - set
     * - get
     * - remove
     */

    private static final int ELEMENTS_1000 = 1000;
    private static final int ELEMENTS_10000 = 10000;

    public static void main(String[] args) {
        MeasureUtil measure = new MeasureUtil();

        // Add
        System.out.println("Add " +
                ELEMENTS_1000 +
                " String elements to arrayList takes " +
                measure.addTimeExecution(ELEMENTS_1000, "arrayList", "this is text to be added") +
                " ms");
        System.out.println("Add " +
                ELEMENTS_1000 +
                " String elements to linkedList takes " +
                measure.addTimeExecution(ELEMENTS_1000, "linkedList", "this is text to be added") +
                " ms");
        System.out.println("Add " +
                ELEMENTS_1000 +
                " Integer elements to arrayList takes " +
                measure.addTimeExecution(ELEMENTS_1000, "arrayList", 100) +
                " ms");
        System.out.println("Add " +
                ELEMENTS_1000 +
                " String elements to linkedList takes " +
                measure.addTimeExecution(ELEMENTS_1000, "linkedList", 100) +
                " ms");

        System.out.println("Add " +
                ELEMENTS_10000 +
                " String elements to arrayList takes " +
                measure.addTimeExecution(ELEMENTS_10000, "arrayList", "this is text to be added") +
                " ms");
        System.out.println("Add " +
                ELEMENTS_10000 +
                " String elements to linkedList takes " +
                measure.addTimeExecution(ELEMENTS_10000, "linkedList", "this is text to be added") +
                " ms");
        System.out.println("Add " +
                ELEMENTS_10000 +
                " Integer elements to arrayList takes " +
                measure.addTimeExecution(ELEMENTS_10000, "arrayList", 100) +
                " ms");
        System.out.println("Add " +
                ELEMENTS_10000 +
                " String elements to linkedList takes " +
                measure.addTimeExecution(ELEMENTS_10000, "linkedList", 100) +
                " ms");

        // Set
//        System.out.println("Set " +
//                ELEMENTS_1000 +
//                " String elements to arrayList takes " +
//                measure.setTimeExecution(ELEMENTS_1000, "arrayList", "this is text to be set") +
//                " ms");
//        System.out.println("Set " +
//                ELEMENTS_1000 +
//                " String elements to linkedList takes " +
//                measure.setTimeExecution(ELEMENTS_1000, "linkedList", "this is text to be set") +
//                " ms");
//        System.out.println("Set " +
//                ELEMENTS_1000 +
//                " Integer elements to arrayList takes " +
//                measure.setTimeExecution(ELEMENTS_1000, "arrayList", 100) +
//                " ms");
//        System.out.println("Set " +
//                ELEMENTS_1000 +
//                " String elements to linkedList takes " +
//                measure.setTimeExecution(ELEMENTS_1000, "linkedList", 100) +
//                " ms");
//
//        System.out.println("Set " +
//                ELEMENTS_10000 +
//                " String elements to arrayList takes " +
//                measure.setTimeExecution(ELEMENTS_10000, "arrayList", "this is text to be set") +
//                " ms");
//        System.out.println("Set " +
//                ELEMENTS_10000 +
//                " String elements to linkedList takes " +
//                measure.setTimeExecution(ELEMENTS_10000, "linkedList", "this is text to be set") +
//                " ms");
//        System.out.println("Set " +
//                ELEMENTS_10000 +
//                " Integer elements to arrayList takes " +
//                measure.setTimeExecution(ELEMENTS_10000, "arrayList", 100) +
//                " ms");
//        System.out.println("Set " +
//                ELEMENTS_10000 +
//                " String elements to linkedList takes " +
//                measure.setTimeExecution(ELEMENTS_10000, "linkedList", 100) +
//                " ms");

    }
}
