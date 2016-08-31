package module2.homework.task4;


import module2.homework.task3.BalanceOfPerson;

public class BalanceOfPersonFund extends BalanceOfPerson {
    private double fund;

    public void fundBalance(double balance) {
        setBalanceNow(balance + fund);
    }

    public void setFund(double fund) {
        this.fund = fund;
    }
}
