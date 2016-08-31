package module2.homework.task3;


//import module2.homework.task2.*;

public class BalanceOfPersonWithdrawl extends BalanceOfPerson {
    public void printTransactionWithdrawl() {

        //String owner = getOwnerName();
        //BalanceOfPerson myPersonalBalance = new BalanceOfPerson();

        if (balanceIsPositive()) {
            setBalanceNow(withdrawalMoneyCalculation());

            System.out.printf("%s %.2f %.2f%n", getOwnerName(), getHowMuchMoneyToWithdraw()
                    , getBalanceNow());
        } else {
            System.out.printf("%s NO%n",  getOwnerName());
        }

    }
}
