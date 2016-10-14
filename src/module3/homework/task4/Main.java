package module3.homework.task4;


public class Main {

    public static void main(String[] args) {
        User myUser = new User("Kumar", 1400, 9, "Apple Inc.", 7000, "USD");

        System.out.println("Balance before salary is: " + myUser.getBalance());

        myUser.paySalary();
        System.out.println("Balance after salary is: " + myUser.getBalance());

        System.out.println("Withdraw some money" );
        myUser.withdraw(500);
        System.out.println("Balance after withdraw is: " + myUser.getBalance());

        System.out.println("Length of the company name: " + myUser.companyNameLength());
    }
}