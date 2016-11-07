package module10.homework.task3;


public class ExceptionNullReference {

    /*
    Define an object reference and initialize it to null.
    Try to call a method through this reference.
    Now wrap the code in a try-catch clause to catch the exception.
    */

    public static void main(String[] args) {
        try {
            String nullString = null;
            nullString.toString();
        } catch (NullPointerException e) {
            System.out.println("We caught " + e + " and handle it here");
        }
    }
}
