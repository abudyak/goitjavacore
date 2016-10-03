package module3.homework.task2;


public class Main {

    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic();
        System.out.println(arithmetic.add(3, 7));

        Adder adder = new Adder();
        System.out.println(adder.add(30, 70));
        System.out.println(adder.check(30, 70));
        System.out.println(adder.check(70, 70));
        System.out.println(adder.check(70, 30));

    }
}
