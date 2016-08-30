package module2.homework.task2;


public class Task2Main {

    public static void main(String[] args) {

        double[] inputBalanceNow = {100};
        double[] inputWithdraw = {10, 99, 50, 10, 20, 5, 0.2};
        int[] inputTransactionCommission = {5}; // Commission in percents

        Balance myBalance = new Balance();
        myBalance.setBalanceNow(inputBalanceNow[0]);

        myBalance.setTransactionCommission(inputTransactionCommission[0]);

        for (int index = 0; index < inputWithdraw.length; index++) {
            myBalance.setHowMuchMoneyToWithdraw(inputWithdraw[index]);
            myBalance.transactionResultPrint();
        }

    }

}
