package module4.homework.task123456;


public class Main {

    public static void main(String[] args) {

        /*
        * Сreate Main class with main method, where you should create 6 Users:
        * 2 of USBank,
        * 2 of EUBank and
        * 2 of ChinaBank.
        * Run four different operations with every User’s balance and print its objects to console.
        */

        Bank usBank = new USBank();
        Bank euBank = new EUBank();
        Bank chinaBank = new ChinaBank();
        BankSystem bankSystem = new BankSystemImpl();

        // -= Creating users =-
        User user1 = new User("John", 5000, "MMM", 2000, usBank);
        User user2 = new User("Bill", 5000, "Luxoft", 3000, usBank);
        User user3 = new User("Frank", 7000, "GM", 5000, euBank);
        User user4 = new User("Emma", 5500, "British AirLines", 4000, euBank);
        User user5 = new User("Olivia", 7000, "Microsoft", 8000, chinaBank);
        User user6 = new User("Eva", 11000, "Google", 9000, chinaBank);

        // -= Test operations with users =-
        usBank.setCurrency(Currency.USD);
        euBank.setCurrency(Currency.EUR);
        chinaBank.setCurrency(Currency.USD);
        System.out.println("User's balances are:");
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
        System.out.println(user4);
        System.out.println(user5);
        System.out.println(user6);
        System.out.println("======================");

        System.out.println("Do withdrawal");
        bankSystem.withdrawOfUser(user1, 500);
        bankSystem.withdrawOfUser(user2, 800);
        bankSystem.withdrawOfUser(user3, 700);
        bankSystem.withdrawOfUser(user4, 200);
        bankSystem.withdrawOfUser(user5, 100);
        bankSystem.withdrawOfUser(user6, 900);
        System.out.println("User's balance after withdrawal are:");
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
        System.out.println(user4);
        System.out.println(user5);
        System.out.println(user6);
        System.out.println("======================");

        System.out.println("Do fund");
        bankSystem.fundUser(user1, 500);
        bankSystem.fundUser(user2, 500);
        bankSystem.fundUser(user3, 500);
        bankSystem.fundUser(user4, 500);
        bankSystem.fundUser(user5, 500);
        bankSystem.fundUser(user6, 500);
        System.out.println("User's balance after funding are:");
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
        System.out.println(user4);
        System.out.println(user5);
        System.out.println(user6);
        System.out.println("======================");

        System.out.println("Do transfer from user1 to user2");
        bankSystem.transferMoney(user1, user2, 100);
        System.out.println("User's balance after transferring are:");
        System.out.println(user1);
        System.out.println(user2);
        System.out.println("======================");

        System.out.println("Do salary");
        bankSystem.paySalary(user1);
        bankSystem.paySalary(user2);
        bankSystem.paySalary(user3);
        bankSystem.paySalary(user4);
        bankSystem.paySalary(user5);
        bankSystem.paySalary(user6);
        System.out.println("User's balance after salary are:");
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
        System.out.println(user4);
        System.out.println(user5);
        System.out.println(user6);
        System.out.println("======================");

    }
}
