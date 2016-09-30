package module6.homework123456;


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
        User[] tempUsers = new User[users.length];

        int counter = 0;

        for (int i = 0; i < users.length; i++) {
            if (isUnique(tempUsers, users[i]))
                tempUsers[counter++] = users[i];
        }

        User[] uniqueUsers = new User[counter];

        System.arraycopy(tempUsers, 0, uniqueUsers, 0, uniqueUsers.length);

        return uniqueUsers;
    }

    public static final User[] usersWithConditionalBalance(User[] users, int balance) {
        // Count users which have the balance
        int counter = 0;
        for (User user : users) {
            if (user.getBalance() == balance) {
                counter++;
            }
        }

        // Save users which have the balance
        User[] usersWithBalance = new User[counter];
        int i = 0;
        for (User user : users) {
            if (user.getBalance() == balance) {
                usersWithBalance[i++] = user;
            }
        }
        return usersWithBalance;
    }

    public static final User[] paySalaryToUsers(User[] users) {
        for (User user : users) {
            user.setSalary(user.getBalance() + user.getSalary());
        }
        return users;
    }

    public static final long[] getUsersId(User[] users) {
        long[] usersId = new long[users.length];
        int i = 0;
        for (User user : users) {
            usersId[i++] = user.getId();
        }

        return usersId;
    }

    public static final User[] deleteEmptyUsers(User[] users) {
        // Count not null users
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
    }
}
