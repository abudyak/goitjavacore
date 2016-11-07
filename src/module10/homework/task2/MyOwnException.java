package module10.homework.task2;


public class MyOwnException extends Exception {

   /*
    Create your own exception class using the extends keyword.
    Write a constructor for this class that takes a String argument and stores it inside the object with a String reference.
    Write a method that prints out the stored String.
    Create a try-catch clause to exercise your new exception.
   */

    private String message;

    public MyOwnException(String message) {
        this.message = message;
    }

    public void printStoredString() {
        System.out.println(message);
    }

    public static void main(String[] args) {
        try {
            throw new MyOwnException("Message from my own exception.");
        } catch (MyOwnException e) {
            e.printStoredString();
        }
    }

}