package module2.homework.task2;


public class Balance {

    private double balanceNow;
    private double howMuchMoneyToWithdraw;
    private float transactionCommission;

    public double withdrawalMoneyCalculation() {
        double balanceCalculation = balanceNow - howMuchMoneyToWithdraw
                - howMuchMoneyToWithdraw * transactionCommission / 100;

        return balanceCalculation;
    }

    public boolean balanceIsPositive() {
        if (withdrawalMoneyCalculation() < 0) {
            return false;
        } else {
            return true;
        }

    }

    public void transactionResultPrint() {
        if (balanceIsPositive()) {
            balanceNow = withdrawalMoneyCalculation();
            System.out.printf("OK %.2f, %.2f %n", howMuchMoneyToWithdraw * transactionCommission / 100, balanceNow);
        } else {
            System.out.printf("NO%n");

        }
    }

    public void setBalanceNow(double balanceNow) {
        this.balanceNow = balanceNow;
    }

    public void setHowMuchMoneyToWithdraw(double howMuchMoneyToWithdraw) {
        this.howMuchMoneyToWithdraw = howMuchMoneyToWithdraw;
    }

    public void setTransactionCommission(float transactionCommission) {
        this.transactionCommission = transactionCommission;
    }

    public double getBalanceNow() {
        return balanceNow;
    }

    public double getHowMuchMoneyToWithdraw() {
        return howMuchMoneyToWithdraw;
    }

    public float getTransactionCommission() {
        return transactionCommission;
    }
}
