package module2.homework.task4;


public class Task4Main{
    public static void main(String[] args) {
        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        double[] fund = {100};

        BalanceOfPersonFund  myFund = new BalanceOfPersonFund();
        myFund.setFund(fund[0]);

        for (int index = 0; index < balances.length; index++) {
            myFund.setOwnerName(ownerNames[index]);
            myFund.fundBalance(balances[index]);
            System.out.printf("%s %.2f%n", myFund.getOwnerName(), myFund.getBalanceNow());
        }
    }

}
