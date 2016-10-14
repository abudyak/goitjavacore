package module2;


public class ForTest {

    public static void main(String[] args) {
        float[] numbers =
                {1, 2, 3, 4, 5, 3, 7, 8, 9, 3};
        for (float item : numbers) {
            System.out.println("Count is: " + item);
        }
    }

}
