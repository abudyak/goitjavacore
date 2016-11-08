package Java4Kids.calc;


public class Calculator {

    static double addTwoNumbers(double first, double second) {
        double result = first + second;
        System.out.println("" + first + " + " +
                second + " = " + result);
        return result;
    }

    static double substructTwoNumbers(double first, double second) {
        double result = first - second;
        System.out.println("" + first + " - " +
                second + " = " + result);
        return result;
    }

    public static void main(String[] args) {
        addTwoNumbers(3.55, 50.00);
        substructTwoNumbers(3.55, 50.00);
    }

}
