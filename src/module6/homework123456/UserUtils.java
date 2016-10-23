package module6.homework123456;


import java.util.Arrays;

public class UserUtils {

    /**
     * Return true if user is appeared only once in the
     * array of users.
     */
    public static final boolean isUnique(User[] array, User user) {
        for (User arr : array) {
            if (user.equals(arr)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Convert the given array to an array with unique values
     * without duplicates and Return it
     */
    public static final User[] toUniqueArray(User[] users) {
        users = deleteEmptyUsers(users);
        User[] result = new User[0];

        for (User user : users) {
            if (isUnique(result, user)) {
                result = Arrays.copyOf(result, result.length + 1);
                result[result.length - 1] = user;
            }
        }
        return result;

//        User[] tempUsers = new User[users.length];
//
//        int counter = 0;
//
//        for (int i = 0; i < users.length; i++) {
//            if (isUnique(tempUsers, users[i]))
//                tempUsers[counter++] = users[i];
//        }
//
//        User[] uniqueUsers = new User[counter];
//
//        System.arraycopy(tempUsers, 0, uniqueUsers, 0, uniqueUsers.length);
//
//        return uniqueUsers;
    }

    public static final User[] usersWithConditionalBalance(User[] users, int balance) {
        users = toUniqueArray(users);
        User[] result = new User[0];

        for (User user : users) {
            if (user.getBalance() == balance) {
                result = Arrays.copyOf(result, result.length + 1);
                result[result.length - 1] = user;
            }
        }
        return result;
    }

//        // Count users which have the balance
//        int counter = 0;
//        for (User user : users) {
//            if (user.getBalance() == balance) {
//                counter++;
//            }
//        }
//
//        // Save users which have the balance
//        User[] usersWithBalance = new User[counter];
//        int i = 0;
//        for (User user : users) {
//            if (user.getBalance() == balance) {
//                usersWithBalance[i++] = user;
//            }
//        }
//        return usersWithBalance;
//


    public static final User[] paySalaryToUsers(User[] users) {
        users = toUniqueArray(users);
        for (User user : users) {
            user.setBalance(user.getBalance() + user.getSalary());
        }
        return users;
    }

    public static final long[] getUsersId(User[] users) {
        users = toUniqueArray(users);
        long[] result = new long[users.length];
        int i = 0;
        for (User user : users) {
            result[i++] = user.getId();
        }
        return result;
    }

    public static final User[] deleteEmptyUsers(User[] users) {
        User[] result = new User[0];
        for (User user : users) {
            if (user != null) {
                result = Arrays.copyOf(result, result.length + 1);
                result[result.length - 1] = user;
            }
        }
        return result;
    /*    // Count not null users
        int count = 0;
        for (User user : users) {
            if (user != null) count++;
        }

        // Save not null users
        User[] notNullUsers = new User[count];
        int i = 0;
        for (User user : users) {
            if (user != null) notNullUsers[i++] = user;
        }
        return notNullUsers;
    */
    }
}
