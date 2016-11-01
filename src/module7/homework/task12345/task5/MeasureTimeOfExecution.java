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

        // Measure of Add operation
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

        // Measure of Set operation
        String initString = "this is text to init array";
        String setString = "this is text to set array";
        Integer initInt = 1;
        Integer setInt = 100;

        System.out.println("\nSet " +
                ELEMENTS_1000 +
                " String elements to arrayList takes " +
                measure.setTimeExecution(measure.generateList(ELEMENTS_1000, "arrayList", initString), setString) +
                " ms");
        System.out.println("Set " +
                ELEMENTS_1000 +
                " String elements to linkedList takes " +
                measure.setTimeExecution(measure.generateList(ELEMENTS_1000, "linkedList", initString), setString) +
                " ms");
        System.out.println("Set " +
                ELEMENTS_1000 +
                " Integer elements to arrayList takes " +
                measure.setTimeExecution(measure.generateList(ELEMENTS_1000, "arrayList", initInt), setInt) +
                " ms");
        System.out.println("Set " +
                ELEMENTS_1000 +
                " String elements to linkedList takes " +
                measure.setTimeExecution(measure.generateList(ELEMENTS_1000, "linkedList", initInt), setInt) +
                " ms");

        System.out.println("Set " +
                ELEMENTS_10000 +
                " String elements to arrayList takes " +
                measure.setTimeExecution(measure.generateList(ELEMENTS_10000, "arrayList", initString), setString) +
                " ms");
        System.out.println("Set " +
                ELEMENTS_10000 +
                " String elements to linkedList takes " +
                measure.setTimeExecution(measure.generateList(ELEMENTS_10000, "linkedList", initString), setString) +
                " ms");
        System.out.println("Set " +
                ELEMENTS_10000 +
                " Integer elements to arrayList takes " +
                measure.setTimeExecution(measure.generateList(ELEMENTS_10000, "arrayList", initInt), setInt) +
                " ms");
        System.out.println("Set " +
                ELEMENTS_10000 +
                " String elements to linkedList takes " +
                measure.setTimeExecution(measure.generateList(ELEMENTS_10000, "linkedList", initInt), setInt) +
                " ms");


        // Measure of Get operation
        initString = "this is text to init array";
        initInt = 1;

        System.out.println("\nGet " +
                ELEMENTS_1000 +
                " String elements to arrayList takes " +
                measure.getTimeExecution(measure.generateList(ELEMENTS_1000, "arrayList", initString)) +
                " ms");
        System.out.println("Get " +
                ELEMENTS_1000 +
                " String elements to linkedList takes " +
                measure.getTimeExecution(measure.generateList(ELEMENTS_1000, "linkedList", initString)) +
                " ms");
        System.out.println("Get " +
                ELEMENTS_1000 +
                " Integer elements to arrayList takes " +
                measure.getTimeExecution(measure.generateList(ELEMENTS_1000, "arrayList", initInt)) +
                " ms");
        System.out.println("Get " +
                ELEMENTS_1000 +
                " String elements to linkedList takes " +
                measure.getTimeExecution(measure.generateList(ELEMENTS_1000, "linkedList", initInt)) +
                " ms");

        System.out.println("Get " +
                ELEMENTS_10000 +
                " String elements to arrayList takes " +
                measure.getTimeExecution(measure.generateList(ELEMENTS_10000, "arrayList", initString)) +
                " ms");
        System.out.println("Get " +
                ELEMENTS_10000 +
                " String elements to linkedList takes " +
                measure.getTimeExecution(measure.generateList(ELEMENTS_10000, "linkedList", initString)) +
                " ms");
        System.out.println("Get " +
                ELEMENTS_10000 +
                " Integer elements to arrayList takes " +
                measure.getTimeExecution(measure.generateList(ELEMENTS_10000, "arrayList", initInt)) +
                " ms");
        System.out.println("Get " +
                ELEMENTS_10000 +
                " String elements to linkedList takes " +
                measure.getTimeExecution(measure.generateList(ELEMENTS_10000, "linkedList", initInt)) +
                " ms");

        // Measure of Remove operation
        initString = "this is text to init array";
        initInt = 1;

        System.out.println("\nRemove " +
                ELEMENTS_1000 +
                " String elements to arrayList takes " +
                measure.removeTimeExecution(measure.generateList(ELEMENTS_1000, "arrayList", initString)) +
                " ms");
        System.out.println("Remove " +
                ELEMENTS_1000 +
                " String elements to linkedList takes " +
                measure.removeTimeExecution(measure.generateList(ELEMENTS_1000, "linkedList", initString)) +
                " ms");
        System.out.println("Remove " +
                ELEMENTS_1000 +
                " Integer elements to arrayList takes " +
                measure.removeTimeExecution(measure.generateList(ELEMENTS_1000, "arrayList", initInt)) +
                " ms");
        System.out.println("Remove " +
                ELEMENTS_1000 +
                " String elements to linkedList takes " +
                measure.removeTimeExecution(measure.generateList(ELEMENTS_1000, "linkedList", initInt)) +
                " ms");

        System.out.println("Remove " +
                ELEMENTS_10000 +
                " String elements to arrayList takes " +
                measure.removeTimeExecution(measure.generateList(ELEMENTS_10000, "arrayList", initString)) +
                " ms");
        System.out.println("Remove " +
                ELEMENTS_10000 +
                " String elements to linkedList takes " +
                measure.removeTimeExecution(measure.generateList(ELEMENTS_10000, "linkedList", initString)) +
                " ms");
        System.out.println("Remove " +
                ELEMENTS_10000 +
                " Integer elements to arrayList takes " +
                measure.removeTimeExecution(measure.generateList(ELEMENTS_10000, "arrayList", initInt)) +
                " ms");
        System.out.println("Remove " +
                ELEMENTS_10000 +
                " String elements to linkedList takes " +
                measure.removeTimeExecution(measure.generateList(ELEMENTS_10000, "linkedList", initInt)) +
                " ms");

    }
}
