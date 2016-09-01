package module2.homework.task3;


public class Task3 {

    static void moneyWithdrawal(String accountOwnerName, int withdrawal, int[] balances, String[] ownerNames) {
        for (int i = 0; i < ownerNames.length; i++) {
            if (accountOwnerName.equals(ownerNames[i])) {

                double transactionCommission = withdrawal * 0.05; // 5% is transaction commission
                double balanceCalculation = balances[i] - (withdrawal + transactionCommission);

                if (balanceCalculation >= 0) {
                    balances[i] = (int) balanceCalculation;
                    System.out.printf("%s %d %d%n", accountOwnerName, withdrawal, balances[i]);
                } else {
                    System.out.printf("%s NO%n", accountOwnerName);
                }
            }
        }
    }

    public static void main(String[] arg) {
        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        String ownerName = "Ann";
        int withdrawal = 100;
        moneyWithdrawal(ownerName, withdrawal, balances, ownerNames);

        ownerName = "Oww";
        withdrawal = 490;
        moneyWithdrawal(ownerName, withdrawal, balances, ownerNames);
    }

}
