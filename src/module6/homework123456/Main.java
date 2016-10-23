package module6.homework123456;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // users initialisation
        User[] usersTest = {
                new User(1L, "Jhon", "Karter", 3000, 10000),
                new User(1L, "Jhon", "Karter", 3000, 10000),
                new User(3L, "Jhon", "Karter", 3000, 40000),
                null,
                new User(4L, "Jhon", "Karter", 5000, 30000),
                null,
                new User(5L, "Linda", "Jhonson", 5000, 10000),
        };

        System.out.println("Here are all users:");
        System.out.println(Arrays.toString(usersTest) + "\n");

        System.out.println("Here are unique users:");
        System.out.println(Arrays.toString(UserUtils.toUniqueArray(usersTest)) + "\n");

        int balance = 10000;
        System.out.println("Here are users with conditional balance in " +
                balance +
                ":");
        System.out.println(Arrays.toString(UserUtils.usersWithConditionalBalance(usersTest, balance)) + "\n");

        System.out.println("Users Ids are: ");
        System.out.println(Arrays.toString(UserUtils.getUsersId(usersTest)) + "\n");

        System.out.println("Do salary to users:");
        System.out.println(Arrays.toString(UserUtils.paySalaryToUsers(usersTest)) + "\n");
    }
}
