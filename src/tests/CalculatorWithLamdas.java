package Java4Kids.calc;


public class CalculatorWithLamdas {

    // Implementing addition as a lambda expression
    static ArithmeticOperation addition = (first, second) -> {
        double result = first + second;
        System.out.println("" + first + " + " + second + " = " + result);
        return result;
    };

    static ArithmeticOperation substruction = (first, second) -> {
        double result = first - second;
        System.out.println("" + first + " - " + second + " = " + result);
        return result;
    };

    public static double calculate(ArithmeticOperation whatToDo, double a, double b) {
        return whatToDo.performOperation(a, b);
    }

    public static void main(String[] args) {
        calculate(addition, 2.35, 50.00);
        calculate(substruction, 10.454, 50.00);
    }

}
