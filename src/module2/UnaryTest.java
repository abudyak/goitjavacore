package module2;


public class UnaryTest {

    public static void main(String[] args) {

        int result = +1;
        int index = 0;
        // result is now 1
        System.out.println(++index + ". " + result);

        result--;
        // result is now 0
        System.out.println(++index + ". " + result);

        result++;
        // result is now 1
        System.out.println(++index + ". " + result);

        result -= result;
        // result is now -1
        System.out.println(++index + ". " + result);

        boolean success = false;
        // false
        System.out.println(success);
        // true
        System.out.println(!success);
    }

}
