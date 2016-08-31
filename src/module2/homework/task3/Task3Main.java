package module2.homework.task3;


public class Task3Main {
    public static void main(String[] args) {
        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        double[] withdraw = {100, 490};
        int[] transactionCommission = {5}; // Commission in percents

        BalanceOfPersonWithdrawl myBalanceWithdrawl = new BalanceOfPersonWithdrawl();

        myBalanceWithdrawl.setTransactionCommission(transactionCommission[0]);

        for (int withdrawIndex = 0; withdrawIndex < withdraw.length; withdrawIndex++) {
            myBalanceWithdrawl.setHowMuchMoneyToWithdraw(withdraw[withdrawIndex]);
            for (int index = 0; index < balances.length; index++) {
                myBalanceWithdrawl.setBalanceNow(balances[index]);
                myBalanceWithdrawl.setOwnerName(ownerNames[index]);
                myBalanceWithdrawl.withdrawalMoneyCalculation();
                myBalanceWithdrawl.printTransactionWithdrawl();
            }

        }

    }
}
