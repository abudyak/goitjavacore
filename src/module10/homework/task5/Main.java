package module10.homework.task5;


public class Main {

    /*
        Create three new types of exceptions.
        Write a class with a method that throws all three.
        In main( ), call the method but only use a single catch clause
        that will catch all three types of exceptions
    */

    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            try {
                throwThreeExceptions(i);
            } catch (MyException1 | MyException2 | MyException3 e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void throwThreeExceptions(int exceptionNumber) throws MyException1, MyException2, MyException3 {
        if (exceptionNumber == 1) {
            throw new MyException1();
        } else if (exceptionNumber == 2) {
            throw new MyException2();
        } else if (exceptionNumber == 3) {
            throw new MyException3();
        }
    }

}
