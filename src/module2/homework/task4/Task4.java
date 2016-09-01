package module2.homework.task4;


public class Task4 {

    static void moneyFund(String accountOwnerName, double fund, int[] balance, String[] ownerNames) {
        for (int i = 0; i < ownerNames.length; i++) {
            if (accountOwnerName.equals(ownerNames[i])) {
                balance[i] += fund;
                System.out.printf("%s %d%n", accountOwnerName, balance[i]);
            }
        }
    }

    public static void main(String[] arg) {
        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        String ownerName = "Oww";
        double fund = 100;

        moneyFund(ownerName, fund, balances, ownerNames);
    }

}
