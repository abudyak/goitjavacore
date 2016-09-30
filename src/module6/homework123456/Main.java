package module6.homework123456;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // users initialisation
        User[] usersTest = {
                new User(1, "Jhon", "Karter", 3000, 10000),
                new User(1, "Jhon", "Karter", 3000, 10000),
                new User(2, "Jhon", "Karter", 3000, 40000),
                new User(2, "Jhon", "Karter", 5000, 30000),
                new User(3, "Linda", "Jhonson", 5000, 10000),
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

        System.out.println("Do salary to users:");
        System.out.println(Arrays.toString(UserUtils.paySalaryToUsers(usersTest)) + "\n");

        System.out.println("Users Ids are: ");
        System.out.println(Arrays.toString(UserUtils.getUsersId(usersTest)) + "\n");

        // Generate null users by initialisation some users, not all
        User[] usersNullTest = new User[5];
        usersNullTest[0] = new User(1, "Jhon", "Karter", 3000, 10000);
        usersNullTest[0] = new User(1, "Jhon", "Karter", 3000, 10000);

        System.out.println("Here are all users and null too:");
        System.out.println(Arrays.toString(usersNullTest) + "\n");
        System.out.println("Here are users after null has been deleted:");
        System.out.println(Arrays.toString(UserUtils.deleteEmptyUsers(usersNullTest)));


    }
}
